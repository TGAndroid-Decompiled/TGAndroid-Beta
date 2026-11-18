package org.telegram.ui.Components;

import android.content.Context;
public final class et0 extends dt0 {
    public final ft0 H;

    public et0(ft0 ft0Var, Context context, int i7) {
        super(ft0Var.f35167e, context, i7, false);
        this.H = ft0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        ft0 ft0Var = this.H;
        gt0 gt0Var = ft0Var.f35167e;
        int i7 = ft0Var.f35164a;
        int[] iArr = gt0.f35563t2;
        bs0 g02 = gt0Var.g0(i7);
        if (g02 != null && g02.f33771n.getVisibility() == 0) {
            ft0Var.d.f();
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
