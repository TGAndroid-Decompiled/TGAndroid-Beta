package org.telegram.ui.Components;

import android.content.Context;
public final class ir0 extends vs0 {
    public final ys0 H;

    public ir0(ys0 ys0Var, Context context) {
        super(ys0Var, context, 0, false);
        this.H = ys0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        ys0 ys0Var = this.H;
        tr0 g02 = ys0Var.g0(8);
        if (g02 != null && g02.f39792n.getVisibility() == 0) {
            ys0Var.f42099g0.f();
        }
        if (g02 != null) {
            pq0 pq0Var = g02.f39795w;
            fi.k6 k6Var = this.f41149s;
            if (k6Var != null && (k6Var.k() || (ys0Var.t0() && this.f41149s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pq0Var.e(z10, true);
        }
    }
}
