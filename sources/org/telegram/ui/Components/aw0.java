package org.telegram.ui.Components;

import android.content.Context;
public final class aw0 extends zv0 {
    public final bw0 G;

    public aw0(bw0 bw0Var, Context context, int i10) {
        super(bw0Var.f25070e, context, i10, false);
        this.G = bw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        bw0 bw0Var = this.G;
        cw0 cw0Var = bw0Var.f25070e;
        int i10 = bw0Var.f25067a;
        int[] iArr = cw0.f25421d2;
        vu0 W = cw0Var.W(i10);
        if (W != null && W.f32519r.getVisibility() == 0) {
            bw0Var.d.l();
        }
        if (W != null) {
            mt0 mt0Var = W.f32521w;
            ai.e9 e9Var = this.f33692s;
            if (e9Var != null && (e9Var.k() || (cw0Var.i0() && this.f33692s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            mt0Var.e(z10, true);
        }
    }
}
