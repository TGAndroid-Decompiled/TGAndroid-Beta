package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eo0 {
    public final po0 f39153a;

    public eo0(po0 po0Var) {
        this.f39153a = po0Var;
    }

    public final void a(Exception exc) {
        po0 po0Var = this.f39153a;
        if (po0Var.Q0) {
            return;
        }
        po0Var.I0(true, false);
        po0Var.E0(false);
        if (!(exc instanceof wc.a) && !(exc instanceof wc.b)) {
            org.telegram.ui.Components.g5.v0(po0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(po0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
