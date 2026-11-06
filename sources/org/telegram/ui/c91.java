package org.telegram.ui;

import android.view.View;
public final class c91 implements View.OnClickListener {
    public final v91 f44727a;

    public c91(v91 v91Var) {
        this.f44727a = v91Var;
    }

    @Override
    public final void onClick(View view) {
        v91 v91Var = this.f44727a;
        if (v91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(v91Var, -v91Var.f50628a, null, v91Var.g(), null, false, v91Var.J, new na(this, 4), v91Var.getResourceProvider());
            return;
        }
        v91Var.getMessagesController().m(v91Var.f50628a, v91Var.getUserConfig().f(), 0, null, v91Var, false, new w81(v91Var, 2), new x81(v91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        v91Var.S0(false);
    }
}
