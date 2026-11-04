package org.telegram.ui.Components;

import android.content.Context;
public final class gr0 extends ts0 {
    public final ws0 H;

    public gr0(ws0 ws0Var, Context context) {
        super(ws0Var, context, 0, false);
        this.H = ws0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        ws0 ws0Var = this.H;
        rr0 g02 = ws0Var.g0(8);
        if (g02 != null && g02.f37787n.getVisibility() == 0) {
            ws0Var.f40089g0.f();
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
