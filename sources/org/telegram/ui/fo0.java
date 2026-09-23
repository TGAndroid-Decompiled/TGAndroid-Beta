package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fo0 {
    public final qo0 f33352a;

    public fo0(qo0 qo0Var) {
        this.f33352a = qo0Var;
    }

    public final void a(Exception exc) {
        qo0 qo0Var = this.f33352a;
        if (qo0Var.Q0) {
            return;
        }
        qo0Var.H0(true, false);
        qo0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(qo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.e5.w0(qo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
