package org.telegram.ui;

import android.view.View;
public final class f40 implements org.telegram.ui.Components.o00, org.telegram.ui.ActionBar.p1, r0.m {
    public final int f45140a;
    public final r40 f45141b;

    public f40(r40 r40Var, int i3) {
        this.f45140a = i3;
        this.f45141b = r40Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int i3 = org.telegram.messenger.g0.I0(k1Var, false).d;
        r40 r40Var = this.f45141b;
        r40Var.f49049n0 = i3;
        ci.l1 l1Var = r40Var.G;
        if (l1Var != null) {
            l1Var.setPadding(0, 0, 0, i3);
        }
        r40Var.o0();
        r40Var.m0();
        return r0.k1.f54025b;
    }

    @Override
    public void a(int i3) {
        r40 r40Var = this.f45141b;
        r40Var.f49033b.a(Math.min(i3, r40Var.f49037d0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45140a) {
            case 1:
                this.f45141b.t0();
                return;
            default:
                this.f45141b.finishFragment();
                return;
        }
    }
}
