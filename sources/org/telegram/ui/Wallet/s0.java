package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class s0 extends BiometricPrompt$AuthenticationCallback {
    public final u0 f33674a;

    public s0(u0 u0Var) {
        this.f33674a = u0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f33674a.f()) {
            u0 u0Var = this.f33674a;
            if (!u0Var.f33721f) {
                if (i10 != 10 && i10 != 5) {
                    u0Var.a();
                } else {
                    u0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f33674a.c(null);
    }
}
