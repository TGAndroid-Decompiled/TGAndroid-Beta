package org.telegram.ui;

import android.view.View;
public final class e91 implements View.OnClickListener {
    public final y91 f45342a;

    public e91(y91 y91Var) {
        this.f45342a = y91Var;
    }

    @Override
    public final void onClick(View view) {
        y91 y91Var = this.f45342a;
        if (y91Var.M == 1) {
            org.telegram.ui.Components.v4.g0(y91Var, -y91Var.f52013a, null, y91Var.g(), null, false, y91Var.J, new na(this, 4), y91Var.getResourceProvider());
            return;
        }
        y91Var.getMessagesController().m(y91Var.f52013a, y91Var.getUserConfig().f(), 0, null, y91Var, false, new y81(y91Var, 2), new z81(y91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        y91Var.S0(false);
    }
}
