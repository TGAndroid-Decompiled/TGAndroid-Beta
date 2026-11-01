package org.telegram.ui.Components;

import android.content.Context;
public final class kv0 extends ha {
    public gs P1;

    public kv0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f26734v1 = true;
        this.f26733u1 = true;
        Y0();
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        this.f26724k1.j(new cu0(this, 2));
        this.f26724k1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        gs gsVar = new gs(uk0Var, getContext(), this.f21584a, 0, true, this.I0);
        this.P1 = gsVar;
        gsVar.f29638r = false;
        return gsVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131745838, null);
    }
}
