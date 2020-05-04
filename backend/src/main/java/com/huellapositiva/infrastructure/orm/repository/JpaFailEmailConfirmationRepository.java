package com.huellapositiva.infrastructure.orm.repository;

import com.huellapositiva.infrastructure.orm.model.FailEmailConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaFailEmailConfirmationRepository extends JpaRepository<FailEmailConfirmation, Integer> {

    @Query("FROM FailEmailConfirmation ec LEFT JOIN FETCH ec.email WHERE ec.email = :email")
    Optional<FailEmailConfirmation> findByEmail(@Param("email") String email);
}