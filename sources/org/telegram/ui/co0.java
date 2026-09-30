package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class co0 {
    public final no0 f32843a;

    public co0(no0 no0Var) {
        this.f32843a = no0Var;
    }

    public final void a(Exception exc) {
        no0 no0Var = this.f32843a;
        if (no0Var.Q0) {
            return;
        }
        no0Var.H0(true, false);
        no0Var.D0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.e5.w0(no0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.e5.w0(no0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
