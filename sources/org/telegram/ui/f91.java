package org.telegram.ui;

import android.view.View;
public final class f91 implements View.OnClickListener {
    public final z91 f45663a;

    public f91(z91 z91Var) {
        this.f45663a = z91Var;
    }

    @Override
    public final void onClick(View view) {
        z91 z91Var = this.f45663a;
        if (z91Var.M == 1) {
            org.telegram.ui.Components.u4.g0(z91Var, -z91Var.f52343a, null, z91Var.g(), null, false, z91Var.J, new na(this, 4), z91Var.getResourceProvider());
            return;
        }
        z91Var.getMessagesController().m(z91Var.f52343a, z91Var.getUserConfig().f(), 0, null, z91Var, false, new z81(z91Var, 2), new a91(z91Var), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
        z91Var.S0(false);
    }
}
