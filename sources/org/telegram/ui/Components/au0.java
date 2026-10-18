package org.telegram.ui.Components;

import android.content.Context;
public final class au0 extends pv0 {
    public final sv0 G;

    public au0(sv0 sv0Var, Context context) {
        super(sv0Var, context, 0, false);
        this.G = sv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        sv0 sv0Var = this.G;
        lu0 W = sv0Var.W(8);
        if (W != null && W.f28332r.getVisibility() == 0) {
            sv0Var.f30349d0.l();
        }
        if (W != null) {
            ct0 ct0Var = W.f28334w;
            ci.z6 z6Var = this.f29435s;
            if (z6Var != null && (z6Var.k() || (sv0Var.j0() && this.f29435s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ct0Var.e(z10, true);
        }
    }
}
