package org.telegram.ui.Components;

import android.content.Context;
public final class hu0 extends na {
    public vr P1;

    public hu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.f36270v1 = true;
        this.f36269u1 = true;
        Y0();
        pj0 pj0Var = this.f36261k1;
        int i7 = this.f28646t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.f36261k1.j(new ui(this, 17));
        this.f36261k1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        vr vrVar = new vr(pj0Var, getContext(), this.f28613a, 0, true, this.I0);
        this.P1 = vrVar;
        vrVar.f35510r = false;
        return vrVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745822, null);
    }
}
