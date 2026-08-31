package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ao0 {
    public final lo0 f35223a;

    public ao0(lo0 lo0Var) {
        this.f35223a = lo0Var;
    }

    public final void a(Exception exc) {
        lo0 lo0Var = this.f35223a;
        if (lo0Var.N0) {
            return;
        }
        lo0Var.H0(true, false);
        lo0Var.D0(false);
        if (!(exc instanceof fc.a) && !(exc instanceof fc.b)) {
            org.telegram.ui.Components.z4.w0(lo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.z4.w0(lo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
