package org.telegram.ui;

import android.view.View;
public final class n40 implements org.telegram.ui.Components.d10, org.telegram.ui.ActionBar.r1, r0.m {
    public final int f50079a;
    public final z40 f50080b;

    public n40(z40 z40Var, int i7) {
        this.f50079a = i7;
        this.f50080b = z40Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = org.telegram.messenger.g0.I0(l1Var, false).d;
        z40 z40Var = this.f50080b;
        z40Var.f54415n0 = i7;
        di.d1 d1Var = z40Var.G;
        if (d1Var != null) {
            d1Var.setPadding(0, 0, 0, i7);
        }
        z40Var.o0();
        z40Var.m0();
        return r0.l1.f56257b;
    }

    @Override
    public void a(int i7) {
        z40 z40Var = this.f50080b;
        z40Var.f54399b.a(Math.min(i7, z40Var.f54403d0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50079a) {
            case 1:
                this.f50080b.t0();
                return;
            default:
                this.f50080b.finishFragment();
                return;
        }
    }
}
