package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final v0 f43192a;

    public u0(v0 v0Var) {
        this.f43192a = v0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f43192a.f()) {
            v0 v0Var = this.f43192a;
            if (!v0Var.f43221f) {
                if (i7 != 10 && i7 != 5) {
                    v0Var.a();
                } else {
                    v0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f43192a.c(null);
    }
}
