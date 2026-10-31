package org.telegram.ui.Components;

import android.content.Context;
public final class jv0 extends ha {
    public gs P1;

    public jv0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f26676v1 = true;
        this.f26675u1 = true;
        Y0();
        tk0 tk0Var = this.f26666k1;
        int i10 = this.f21615t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        this.f26666k1.j(new bu0(this, 2));
        this.f26666k1.setOnItemClickListener(new k(this, 14));
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        gs gsVar = new gs(tk0Var, getContext(), this.f21583a, 0, true, this.I0);
        this.P1 = gsVar;
        gsVar.f29295r = false;
        return gsVar;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131745838, null);
    }
}
