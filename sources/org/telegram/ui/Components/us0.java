package org.telegram.ui.Components;

import android.content.Context;
public final class us0 extends ts0 {
    public final vs0 H;

    public us0(vs0 vs0Var, Context context, int i3) {
        super(vs0Var.f39783e, context, i3, false);
        this.H = vs0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        vs0 vs0Var = this.H;
        ws0 ws0Var = vs0Var.f39783e;
        int i3 = vs0Var.f39780a;
        int[] iArr = ws0.f40063t2;
        rr0 g02 = ws0Var.g0(i3);
        if (g02 != null && g02.f37787n.getVisibility() == 0) {
            vs0Var.d.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.f37790w;
            ei.r6 r6Var = this.f38550s;
            if (r6Var != null && (r6Var.k() || (ws0Var.t0() && this.f38550s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            nq0Var.e(z10, true);
        }
    }
}
