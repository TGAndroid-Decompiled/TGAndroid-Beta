package org.telegram.ui;

import android.view.View;
public final class i50 implements org.telegram.ui.Components.i10, org.telegram.ui.ActionBar.u1, r0.m {
    public final int f37943a;
    public final u50 f37944b;

    public i50(u50 u50Var, int i10) {
        this.f37943a = i10;
        this.f37944b = u50Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = org.telegram.messenger.i0.I0(j1Var, false).d;
        u50 u50Var = this.f37944b;
        u50Var.m0 = i10;
        jg.a3 a3Var = u50Var.F;
        if (a3Var != null) {
            a3Var.setPadding(0, 0, 0, i10);
        }
        u50Var.o0();
        u50Var.m0();
        return r0.j1.f46142b;
    }

    @Override
    public void a(int i10) {
        u50 u50Var = this.f37944b;
        u50Var.f41802b.a(Math.min(i10, u50Var.f41805c0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37943a) {
            case 1:
                this.f37944b.t0();
                return;
            default:
                this.f37944b.finishFragment();
                return;
        }
    }
}
