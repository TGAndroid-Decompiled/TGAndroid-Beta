package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class go0 {
    public final ro0 f39663a;

    public go0(ro0 ro0Var) {
        this.f39663a = ro0Var;
    }

    public final void a(Exception exc) {
        ro0 ro0Var = this.f39663a;
        if (ro0Var.Q0) {
            return;
        }
        ro0Var.I0(true, false);
        ro0Var.E0(false);
        if (!(exc instanceof wc.a) && !(exc instanceof wc.b)) {
            org.telegram.ui.Components.g5.v0(ro0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(ro0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
