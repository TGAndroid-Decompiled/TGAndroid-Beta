package org.telegram.ui;

import android.view.View;
public final class a91 implements View.OnClickListener {
    public final u91 f44974a;

    public a91(u91 u91Var) {
        this.f44974a = u91Var;
    }

    @Override
    public final void onClick(View view) {
        u91 u91Var = this.f44974a;
        if (u91Var.N == 1) {
            org.telegram.ui.Components.t4.g0(u91Var, -u91Var.f51835a, null, u91Var.g(), null, false, u91Var.K, new na(this, 4), u91Var.getResourceProvider());
            return;
        }
        u91Var.getMessagesController().m(u91Var.f51835a, u91Var.getUserConfig().f(), 0, null, u91Var, false, new u81(u91Var, 2), new v81(u91Var), null);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.I4, new Object[0]);
        u91Var.S0(false);
    }
}
