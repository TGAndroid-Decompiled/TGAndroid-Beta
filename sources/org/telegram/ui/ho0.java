package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ho0 {
    public final so0 f37124a;

    public ho0(so0 so0Var) {
        this.f37124a = so0Var;
    }

    public final void a(Exception exc) {
        so0 so0Var = this.f37124a;
        if (so0Var.Q0) {
            return;
        }
        so0Var.H0(true, false);
        so0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(so0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.e5.w0(so0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
