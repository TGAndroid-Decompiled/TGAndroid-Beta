package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
public final class e1 extends BiometricPrompt$AuthenticationCallback {
    public final f1 f44196a;

    public e1(f1 f1Var) {
        this.f44196a = f1Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.f44196a.f()) {
            f1 f1Var = this.f44196a;
            if (!f1Var.f44277f) {
                if (i7 != 10 && i7 != 5) {
                    f1Var.a();
                } else {
                    f1Var.c("AUTH_CANCELED");
                }
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f44196a.c(null);
    }
}
