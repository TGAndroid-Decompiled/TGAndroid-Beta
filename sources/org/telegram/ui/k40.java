package org.telegram.ui;

import android.view.View;
public final class k40 implements org.telegram.ui.Components.s00, org.telegram.ui.ActionBar.r1, r0.m {
    public final int f47101a;
    public final w40 f47102b;

    public k40(w40 w40Var, int i7) {
        this.f47101a = i7;
        this.f47102b = w40Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        w40 w40Var = this.f47102b;
        w40Var.m0 = i7;
        bi.s1 s1Var = w40Var.F;
        if (s1Var != null) {
            s1Var.setPadding(0, 0, 0, i7);
        }
        w40Var.o0();
        w40Var.m0();
        return r0.k1.f54107b;
    }

    @Override
    public void a(int i7) {
        w40 w40Var = this.f47102b;
        w40Var.f50925b.a(Math.min(i7, w40Var.f50928c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47101a) {
            case 1:
                this.f47102b.t0();
                return;
            default:
                this.f47102b.finishFragment();
                return;
        }
    }
}
