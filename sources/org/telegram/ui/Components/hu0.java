package org.telegram.ui.Components;

import android.content.Context;
public final class hu0 extends na {
    public vr P1;

    public hu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.f36337v1 = true;
        this.f36336u1 = true;
        Y0();
        pj0 pj0Var = this.f36328k1;
        int i7 = this.f28645t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.f36328k1.j(new ui(this, 17));
        this.f36328k1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        vr vrVar = new vr(pj0Var, getContext(), this.f28612a, 0, true, this.I0);
        this.P1 = vrVar;
        vrVar.f33473r = false;
        return vrVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745822, null);
    }
}
