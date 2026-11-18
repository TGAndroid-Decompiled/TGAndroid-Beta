package org.telegram.ui.Components;

import android.content.Context;
public final class qr0 extends dt0 {
    public final gt0 H;

    public qr0(gt0 gt0Var, Context context) {
        super(gt0Var, context, 0, false);
        this.H = gt0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        gt0 gt0Var = this.H;
        bs0 g02 = gt0Var.g0(8);
        if (g02 != null && g02.f33771n.getVisibility() == 0) {
            gt0Var.f35589g0.f();
        }
        if (g02 != null) {
            xq0 xq0Var = g02.f33774w;
            fi.h6 h6Var = this.f34504s;
            if (h6Var != null && (h6Var.k() || (gt0Var.t0() && this.f34504s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            xq0Var.e(z10, true);
        }
    }
}
