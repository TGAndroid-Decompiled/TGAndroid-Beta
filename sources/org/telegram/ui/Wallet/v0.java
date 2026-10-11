package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v0 extends FingerprintManager.AuthenticationCallback {
    public final w0 f35659a;

    public v0(w0 w0Var) {
        this.f35659a = w0Var;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        w0 w0Var = this.f35659a;
        if (w0Var.f() && !w0Var.f35686f) {
            if (i10 == 5) {
                w0Var.c("AUTH_CANCELED");
            } else {
                w0Var.a();
            }
        }
    }

    @Override
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        w0 w0Var = this.f35659a;
        if (w0Var.f() && (alertDialog = w0Var.f35688i) != null) {
            alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        w0 w0Var = this.f35659a;
        if (w0Var.f() && (alertDialog = w0Var.f35688i) != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        w0 w0Var = this.f35659a;
        if (!w0Var.f35686f) {
            w0Var.c(null);
        }
    }
}
