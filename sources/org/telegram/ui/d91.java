package org.telegram.ui;

import android.view.View;
public final class d91 implements View.OnClickListener {
    public final w91 f45033a;

    public d91(w91 w91Var) {
        this.f45033a = w91Var;
    }

    @Override
    public final void onClick(View view) {
        w91 w91Var = this.f45033a;
        if (w91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(w91Var, -w91Var.f50992a, null, w91Var.g(), null, false, w91Var.J, new na(this, 4), w91Var.getResourceProvider());
            return;
        }
        w91Var.getMessagesController().m(w91Var.f50992a, w91Var.getUserConfig().f(), 0, null, w91Var, false, new x81(w91Var, 2), new y81(w91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        w91Var.S0(false);
    }
}
