package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class d1 extends BiometricPrompt$AuthenticationCallback {
    public final e1 f44035a;

    public d1(e1 e1Var) {
        this.f44035a = e1Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f44035a.f()) {
            e1 e1Var = this.f44035a;
            if (!e1Var.f44114f) {
                if (i7 != 10 && i7 != 5) {
                    e1Var.a();
                } else {
                    e1Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f44035a.c(null);
    }
}
