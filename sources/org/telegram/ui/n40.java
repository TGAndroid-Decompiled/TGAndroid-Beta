package org.telegram.ui;

import android.view.View;
public final class n40 implements org.telegram.ui.Components.f10, org.telegram.ui.ActionBar.q1, r0.m {
    public final int f50072a;
    public final z40 f50073b;

    public n40(z40 z40Var, int i7) {
        this.f50072a = i7;
        this.f50073b = z40Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = org.telegram.messenger.g0.I0(l1Var, false).d;
        z40 z40Var = this.f50073b;
        z40Var.f54385n0 = i7;
        di.d1 d1Var = z40Var.G;
        if (d1Var != null) {
            d1Var.setPadding(0, 0, 0, i7);
        }
        z40Var.o0();
        z40Var.m0();
        return r0.l1.f56267b;
    }

    @Override
    public void a(int i7) {
        z40 z40Var = this.f50073b;
        z40Var.f54369b.a(Math.min(i7, z40Var.f54373d0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50072a) {
            case 1:
                this.f50073b.t0();
                return;
            default:
                this.f50073b.finishFragment();
                return;
        }
    }
}
