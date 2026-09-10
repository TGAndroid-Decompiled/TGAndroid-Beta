package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lo0 {
    public final wo0 f34747a;

    public lo0(wo0 wo0Var) {
        this.f34747a = wo0Var;
    }

    public final void a(Exception exc) {
        wo0 wo0Var = this.f34747a;
        if (wo0Var.Q0) {
            return;
        }
        wo0Var.H0(true, false);
        wo0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.d5.w0(wo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.d5.w0(wo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
