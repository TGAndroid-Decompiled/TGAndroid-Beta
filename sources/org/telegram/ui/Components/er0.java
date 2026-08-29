package org.telegram.ui.Components;

import android.content.Context;
public final class er0 extends nu0 {
    public final qu0 C;

    public er0(qu0 qu0Var, Context context) {
        super(qu0Var, context, 0, true);
        this.C = qu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        qu0 qu0Var = this.C;
        it0 W = qu0Var.W(9);
        if (W != null && W.f29469r.getVisibility() == 0) {
            qu0Var.f32057b0.l();
        }
        if (W != null) {
            zr0 zr0Var = W.f29471w;
            lh.k6 k6Var = this.f31151s;
            if (k6Var != null && (k6Var.k() || (qu0Var.i0() && this.f31151s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zr0Var.e(z10, true);
        }
    }
}
