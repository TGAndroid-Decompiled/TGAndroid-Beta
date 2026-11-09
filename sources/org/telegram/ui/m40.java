package org.telegram.ui;

import android.view.View;
public final class m40 implements org.telegram.ui.Components.t00, org.telegram.ui.ActionBar.r1, r0.m {
    public final int f47741a;
    public final y40 f47742b;

    public m40(y40 y40Var, int i7) {
        this.f47741a = i7;
        this.f47742b = y40Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        y40 y40Var = this.f47742b;
        y40Var.m0 = i7;
        bi.s1 s1Var = y40Var.F;
        if (s1Var != null) {
            s1Var.setPadding(0, 0, 0, i7);
        }
        y40Var.o0();
        y40Var.m0();
        return r0.k1.f54213b;
    }

    @Override
    public void a(int i7) {
        y40 y40Var = this.f47742b;
        y40Var.f51857b.a(Math.min(i7, y40Var.f51860c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47741a) {
            case 1:
                this.f47742b.t0();
                return;
            default:
                this.f47742b.finishFragment();
                return;
        }
    }
}
