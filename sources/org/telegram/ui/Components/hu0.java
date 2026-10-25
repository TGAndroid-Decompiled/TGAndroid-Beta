package org.telegram.ui.Components;

import android.content.Context;
public final class hu0 extends xv0 {
    public final aw0 G;

    public hu0(aw0 aw0Var, Context context) {
        super(aw0Var, context, 0, false);
        this.G = aw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        aw0 aw0Var = this.G;
        tu0 d02 = aw0Var.d0(8);
        if (d02 != null && d02.f33157n.getVisibility() == 0) {
            aw0Var.f26652f0.l();
        }
        if (d02 != null) {
            ot0 ot0Var = d02.v;
            di.z6 z6Var = this.f34830s;
            if (z6Var != null && (z6Var.k() || (aw0Var.q0() && this.f34830s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ot0Var.e(z10, true);
        }
    }
}
