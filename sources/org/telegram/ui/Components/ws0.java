package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 extends vs0 {
    public final xs0 G;

    public ws0(xs0 xs0Var, Context context, int i7) {
        super(xs0Var.f40398e, context, i7, false);
        this.G = xs0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        xs0 xs0Var = this.G;
        ys0 ys0Var = xs0Var.f40398e;
        int i7 = xs0Var.f40395a;
        int[] iArr = ys0.f40644s2;
        tr0 g02 = ys0Var.g0(i7);
        if (g02 != null && g02.f38386n.getVisibility() == 0) {
            xs0Var.d.f();
        }
        if (g02 != null) {
            oq0 oq0Var = g02.f38389w;
            di.r6 r6Var = this.f39730s;
            if (r6Var != null && (r6Var.k() || (ys0Var.t0() && this.f39730s.g() > 0))) {
                z9 = true;
            } else {
                z9 = false;
            }
            oq0Var.e(z9, true);
        }
    }
}
