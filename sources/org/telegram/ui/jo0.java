package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jo0 {
    public final uo0 f39092a;

    public jo0(uo0 uo0Var) {
        this.f39092a = uo0Var;
    }

    public final void a(Exception exc) {
        uo0 uo0Var = this.f39092a;
        if (uo0Var.Q0) {
            return;
        }
        uo0Var.H0(true, false);
        uo0Var.D0(false);
        if (!(exc instanceof uc.a) && !(exc instanceof uc.b)) {
            org.telegram.ui.Components.g5.v0(uo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(uo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
