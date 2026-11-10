package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final u0 f43176a;

    public t0(u0 u0Var) {
        this.f43176a = u0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f43176a.f()) {
            u0 u0Var = this.f43176a;
            if (!u0Var.f43206f) {
                if (i7 != 10 && i7 != 5) {
                    u0Var.a();
                } else {
                    u0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f43176a.c(null);
    }
}
