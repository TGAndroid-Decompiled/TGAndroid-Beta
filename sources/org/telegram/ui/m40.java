package org.telegram.ui;

import android.view.View;
public final class m40 implements org.telegram.ui.Components.d10, org.telegram.ui.ActionBar.q1, r0.m {
    public final int f49951a;
    public final y40 f49952b;

    public m40(y40 y40Var, int i7) {
        this.f49951a = i7;
        this.f49952b = y40Var;
    }

    @Override
    public void a(int i7) {
        y40 y40Var = this.f49952b;
        y40Var.f54192b.a(Math.min(i7, y40Var.f54196d0));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49951a) {
            case 1:
                this.f49952b.t0();
                return;
            default:
                this.f49952b.finishFragment();
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int i7 = org.telegram.messenger.g0.I0(l1Var, false).d;
        y40 y40Var = this.f49952b;
        y40Var.f54208n0 = i7;
        di.d1 d1Var = y40Var.G;
        if (d1Var != null) {
            d1Var.setPadding(0, 0, 0, i7);
        }
        y40Var.o0();
        y40Var.m0();
        return r0.l1.f56380b;
    }
}
