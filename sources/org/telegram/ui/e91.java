package org.telegram.ui;

import android.view.View;
public final class e91 implements View.OnClickListener {
    public final y91 f47213a;

    public e91(y91 y91Var) {
        this.f47213a = y91Var;
    }

    @Override
    public final void onClick(View view) {
        y91 y91Var = this.f47213a;
        if (y91Var.N == 1) {
            org.telegram.ui.Components.c5.g0(y91Var, -y91Var.f54099a, null, y91Var.g(), null, false, y91Var.K, new na(this, 4), y91Var.getResourceProvider());
            return;
        }
        y91Var.getMessagesController().m(y91Var.f54099a, y91Var.getUserConfig().f(), 0, null, y91Var, false, new y81(y91Var, 2), new z81(y91Var), null);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.L4, new Object[0]);
        y91Var.S0(false);
    }
}
