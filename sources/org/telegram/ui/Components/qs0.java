package org.telegram.ui.Components;

import android.content.Context;
public final class qs0 extends zv0 {
    public final cw0 G;

    public qs0(cw0 cw0Var, Context context) {
        super(cw0Var, context, 0, true);
        this.G = cw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        cw0 cw0Var = this.G;
        vu0 W = cw0Var.W(9);
        if (W != null && W.f32556r.getVisibility() == 0) {
            cw0Var.f25502f0.l();
        }
        if (W != null) {
            mt0 mt0Var = W.f32558w;
            ai.e9 e9Var = this.f33716s;
            if (e9Var != null && (e9Var.k() || (cw0Var.i0() && this.f33716s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            mt0Var.e(z10, true);
        }
    }
}
