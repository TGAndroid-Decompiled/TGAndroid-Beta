package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class do0 {
    public final oo0 f33165a;

    public do0(oo0 oo0Var) {
        this.f33165a = oo0Var;
    }

    public final void a(Exception exc) {
        oo0 oo0Var = this.f33165a;
        if (oo0Var.Q0) {
            return;
        }
        oo0Var.H0(true, false);
        oo0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(oo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.e5.w0(oo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
