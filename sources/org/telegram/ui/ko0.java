package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 {
    public final vo0 f39321a;

    public ko0(vo0 vo0Var) {
        this.f39321a = vo0Var;
    }

    public final void a(Exception exc) {
        vo0 vo0Var = this.f39321a;
        if (vo0Var.Q0) {
            return;
        }
        vo0Var.H0(true, false);
        vo0Var.D0(false);
        if (!(exc instanceof uc.a) && !(exc instanceof uc.b)) {
            org.telegram.ui.Components.g5.v0(vo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(vo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
