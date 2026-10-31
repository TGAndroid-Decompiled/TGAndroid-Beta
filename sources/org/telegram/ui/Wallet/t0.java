package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final u0 f35220a;

    public t0(u0 u0Var) {
        this.f35220a = u0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f35220a.f()) {
            u0 u0Var = this.f35220a;
            if (!u0Var.f35261f) {
                if (i10 != 10 && i10 != 5) {
                    u0Var.a();
                } else {
                    u0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f35220a.c(null);
    }
}
