package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 {
    public final yo0 f36140a;

    public no0(yo0 yo0Var) {
        this.f36140a = yo0Var;
    }

    public final void a(Exception exc) {
        yo0 yo0Var = this.f36140a;
        if (yo0Var.Q0) {
            return;
        }
        yo0Var.H0(true, false);
        yo0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.c5.w0(yo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.c5.w0(yo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
