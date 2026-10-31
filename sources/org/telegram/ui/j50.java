package org.telegram.ui;

import android.view.View;
public final class j50 implements org.telegram.ui.Components.i10, org.telegram.ui.ActionBar.u1, r0.m {
    public final int f38431a;
    public final v50 f38432b;

    public j50(v50 v50Var, int i10) {
        this.f38431a = i10;
        this.f38432b = v50Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = org.telegram.messenger.i0.I0(j1Var, false).d;
        v50 v50Var = this.f38432b;
        v50Var.m0 = i10;
        jg.a3 a3Var = v50Var.F;
        if (a3Var != null) {
            a3Var.setPadding(0, 0, 0, i10);
        }
        v50Var.n0();
        v50Var.l0();
        return r0.j1.f46131b;
    }

    @Override
    public void a(int i10) {
        v50 v50Var = this.f38432b;
        v50Var.f42607b.a(Math.min(i10, v50Var.f42610c0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38431a) {
            case 1:
                this.f38432b.s0();
                return;
            default:
                this.f38432b.finishFragment();
                return;
        }
    }
}
