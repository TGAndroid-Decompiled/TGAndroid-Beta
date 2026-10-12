package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 {
    public final xo0 f40103a;

    public mo0(xo0 xo0Var) {
        this.f40103a = xo0Var;
    }

    public final void a(Exception exc) {
        xo0 xo0Var = this.f40103a;
        if (xo0Var.Q0) {
            return;
        }
        xo0Var.H0(true, false);
        xo0Var.D0(false);
        if (!(exc instanceof uc.a) && !(exc instanceof uc.b)) {
            org.telegram.ui.Components.g5.v0(xo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
