package ma.yassine.hospital;

import ma.yassine.hospital.entities.Patient;
import ma.yassine.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.save(Patient.builder().nom("Taha")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(21).build());
        patientRepository.save(Patient.builder().nom("Nora")
                .dateNaissance(new Date())
                .sexe("female")
                .malade(false).score(41).build());
        patientRepository.save(Patient.builder().nom("mohamed")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(true).score(31).build());
        patientRepository.save(Patient.builder().nom("anas")
                .dateNaissance(new Date())
                .sexe("male")
                .malade(false).score(231).build());
        patientRepository.findAll().forEach(System.out::println);

    }
}
