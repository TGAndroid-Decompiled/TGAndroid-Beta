package org.telegram.ui.Components;

import android.content.Context;
public final class hr0 extends vs0 {
    public final ys0 G;

    public hr0(ys0 ys0Var, Context context) {
        super(ys0Var, context, 0, false);
        this.G = ys0Var;
    }

    @Override
    public final void f() {
        boolean z9;
        super.f();
        ys0 ys0Var = this.G;
        tr0 g02 = ys0Var.g0(8);
        if (g02 != null && g02.f38386n.getVisibility() == 0) {
            ys0Var.f40667f0.f();
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
