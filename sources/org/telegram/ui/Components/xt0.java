package org.telegram.ui.Components;

import android.content.Context;
public final class xt0 extends wt0 {
    public final yt0 G;

    public xt0(yt0 yt0Var, Context context, int i10) {
        super(yt0Var.e, context, i10, false);
        this.G = yt0Var;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        yt0 yt0Var = this.G;
        zt0 zt0Var = yt0Var.e;
        int i10 = yt0Var.f32788a;
        int[] iArr = zt0.f33165s2;
        ss0 e02 = zt0Var.e0(i10);
        if (e02 != null && e02.f30352n.getVisibility() == 0) {
            yt0Var.d.f();
        }
        if (e02 != null) {
            or0 or0Var = e02.f30355w;
            th.x4 x4Var = this.f32251s;
            if (x4Var != null && (x4Var.k() || (zt0Var.r0() && this.f32251s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            or0Var.e(z10, true);
        }
    }
}
