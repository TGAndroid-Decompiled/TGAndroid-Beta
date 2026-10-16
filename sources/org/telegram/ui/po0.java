package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class po0 {
    public final ap0 f38981a;

    public po0(ap0 ap0Var) {
        this.f38981a = ap0Var;
    }

    public final void a(Exception exc) {
        ap0 ap0Var = this.f38981a;
        if (ap0Var.Q0) {
            return;
        }
        ap0Var.H0(true, false);
        ap0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.g5.v0(ap0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(ap0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
