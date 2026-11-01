package org.telegram.ui.Components;

import android.content.Context;
public final class yt0 extends xt0 {
    public final zt0 G;

    public yt0(zt0 zt0Var, Context context, int i10) {
        super(zt0Var.e, context, i10, false);
        this.G = zt0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        zt0 zt0Var = this.G;
        au0 au0Var = zt0Var.e;
        int i10 = zt0Var.f33222a;
        int[] iArr = au0.f24493s2;
        ts0 f02 = au0Var.f0(i10);
        if (f02 != null && f02.f30719n.getVisibility() == 0) {
            zt0Var.d.f();
        }
        if (f02 != null) {
            pr0 pr0Var = f02.f30722w;
            th.x4 x4Var = this.f32635s;
            if (x4Var != null && (x4Var.k() || (au0Var.s0() && this.f32635s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pr0Var.e(z10, true);
        }
    }
}
