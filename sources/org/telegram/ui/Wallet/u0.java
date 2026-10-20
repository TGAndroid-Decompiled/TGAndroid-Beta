package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final w0 f34980a;

    public u0(w0 w0Var) {
        this.f34980a = w0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f34980a.f()) {
            w0 w0Var = this.f34980a;
            if (!w0Var.f35053f) {
                if (i10 != 10 && i10 != 5) {
                    w0Var.a();
                } else {
                    w0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f34980a.c(null);
    }
}
