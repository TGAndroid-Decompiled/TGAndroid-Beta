package org.telegram.ui.Components;

import android.content.Context;
public final class su0 extends ra {
    public hs T1;

    public su0(Context context) {
        super(context, null, true, false, null);
        O();
        this.f39257z1 = true;
        this.f39256y1 = true;
        Z0();
        ek0 ek0Var = this.f39246o1;
        int i7 = this.f30261u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.f39246o1.j(new na(this, 20));
        this.f39246o1.setOnItemClickListener(new n(this, 14));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        hs hsVar = new hs(ek0Var, getContext(), this.f30223a, 0, true, this.J0);
        this.T1 = hsVar;
        hsVar.f33631r = false;
        return hsVar;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131745625, null);
    }
}
