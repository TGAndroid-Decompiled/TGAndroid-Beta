package org.telegram.ui.Components;

import android.content.Context;
public final class vs0 extends us0 {
    public final ws0 G;

    public vs0(ws0 ws0Var, Context context, int i7) {
        super(ws0Var.f40073e, context, i7, false);
        this.G = ws0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        ws0 ws0Var = this.G;
        xs0 xs0Var = ws0Var.f40073e;
        int i7 = ws0Var.f40070a;
        int[] iArr = xs0.f40330s2;
        sr0 g02 = xs0Var.g0(i7);
        if (g02 != null && g02.f38146n.getVisibility() == 0) {
            ws0Var.d.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.f38149w;
            di.q6 q6Var = this.f38730s;
            if (q6Var != null && (q6Var.k() || (xs0Var.t0() && this.f38730s.g() > 0))) {
                z9 = true;
            } else {
                z9 = false;
            }
            nq0Var.e(z9, true);
        }
    }
}
