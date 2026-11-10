package org.telegram.ui;

import android.view.View;
public final class n40 implements org.telegram.ui.Components.s00, org.telegram.ui.ActionBar.r1, r0.m {
    public final int f48111a;
    public final z40 f48112b;

    public n40(z40 z40Var, int i7) {
        this.f48111a = i7;
        this.f48112b = z40Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        z40 z40Var = this.f48112b;
        z40Var.m0 = i7;
        bi.s1 s1Var = z40Var.F;
        if (s1Var != null) {
            s1Var.setPadding(0, 0, 0, i7);
        }
        z40Var.o0();
        z40Var.m0();
        return r0.k1.f54212b;
    }

    @Override
    public void a(int i7) {
        z40 z40Var = this.f48112b;
        z40Var.f52212b.a(Math.min(i7, z40Var.f52215c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48111a) {
            case 1:
                this.f48112b.t0();
                return;
            default:
                this.f48112b.finishFragment();
                return;
        }
    }
}
