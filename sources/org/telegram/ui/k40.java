package org.telegram.ui;

import android.view.View;
public final class k40 implements org.telegram.ui.Components.w00, org.telegram.ui.ActionBar.q1, r0.m {
    public final int f48581a;
    public final w40 f48582b;

    public k40(w40 w40Var, int i7) {
        this.f48581a = i7;
        this.f48582b = w40Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        w40 w40Var = this.f48582b;
        w40Var.f52416n0 = i7;
        di.e1 e1Var = w40Var.G;
        if (e1Var != null) {
            e1Var.setPadding(0, 0, 0, i7);
        }
        w40Var.o0();
        w40Var.m0();
        return r0.k1.f55681b;
    }

    @Override
    public void a(int i7) {
        w40 w40Var = this.f48582b;
        w40Var.f52400b.a(Math.min(i7, w40Var.f52404d0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48581a) {
            case 1:
                this.f48582b.t0();
                return;
            default:
                this.f48582b.finishFragment();
                return;
        }
    }
}
