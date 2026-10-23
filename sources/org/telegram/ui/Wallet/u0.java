package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final w0 f34985a;

    public u0(w0 w0Var) {
        this.f34985a = w0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.f34985a.f()) {
            w0 w0Var = this.f34985a;
            if (!w0Var.f35058f) {
                if (i10 != 10 && i10 != 5) {
                    w0Var.a();
                } else {
                    w0Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f34985a.c(null);
    }
}
