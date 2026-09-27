package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class go0 {
    public final ro0 f33984a;

    public go0(ro0 ro0Var) {
        this.f33984a = ro0Var;
    }

    public final void a(Exception exc) {
        ro0 ro0Var = this.f33984a;
        if (ro0Var.Q0) {
            return;
        }
        ro0Var.H0(true, false);
        ro0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(ro0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.e5.w0(ro0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
