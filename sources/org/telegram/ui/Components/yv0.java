package org.telegram.ui.Components;

import android.content.Context;
public final class yv0 extends xv0 {
    public final zv0 G;

    public yv0(zv0 zv0Var, Context context, int i10) {
        super(zv0Var.e, context, i10, false);
        this.G = zv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        zv0 zv0Var = this.G;
        aw0 aw0Var = zv0Var.e;
        int i10 = zv0Var.f35412a;
        int[] iArr = aw0.f26634p2;
        tu0 d02 = aw0Var.d0(i10);
        if (d02 != null && d02.f33160n.getVisibility() == 0) {
            zv0Var.d.l();
        }
        if (d02 != null) {
            ot0 ot0Var = d02.v;
            di.z6 z6Var = this.f34833s;
            if (z6Var != null && (z6Var.k() || (aw0Var.q0() && this.f34833s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ot0Var.e(z10, true);
        }
    }
}
