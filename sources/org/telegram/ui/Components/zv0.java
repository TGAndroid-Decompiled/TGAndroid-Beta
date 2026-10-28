package org.telegram.ui.Components;

import android.content.Context;
public final class zv0 extends yv0 {
    public final aw0 G;

    public zv0(aw0 aw0Var, Context context, int i10) {
        super(aw0Var.e, context, i10, false);
        this.G = aw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        aw0 aw0Var = this.G;
        bw0 bw0Var = aw0Var.e;
        int i10 = aw0Var.f26682a;
        int[] iArr = bw0.f26922p2;
        uu0 d02 = bw0Var.d0(i10);
        if (d02 != null && d02.f33468n.getVisibility() == 0) {
            aw0Var.d.l();
        }
        if (d02 != null) {
            pt0 pt0Var = d02.v;
            di.z6 z6Var = this.f35173s;
            if (z6Var != null && (z6Var.k() || (bw0Var.q0() && this.f35173s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            pt0Var.e(z10, true);
        }
    }
}
