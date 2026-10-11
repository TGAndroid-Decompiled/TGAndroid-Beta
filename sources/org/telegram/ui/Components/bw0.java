package org.telegram.ui.Components;

import android.content.Context;
public final class bw0 extends aw0 {
    public final cw0 G;

    public bw0(cw0 cw0Var, Context context, int i10) {
        super(cw0Var.f25335e, context, i10, false);
        this.G = cw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        cw0 cw0Var = this.G;
        dw0 dw0Var = cw0Var.f25335e;
        int i10 = cw0Var.f25332a;
        int[] iArr = dw0.f25682d2;
        wu0 W = dw0Var.W(i10);
        if (W != null && W.f32744r.getVisibility() == 0) {
            cw0Var.d.l();
        }
        if (W != null) {
            nt0 nt0Var = W.f32746w;
            ai.e9 e9Var = this.f24608s;
            if (e9Var != null && (e9Var.k() || (dw0Var.i0() && this.f24608s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            nt0Var.e(z10, true);
        }
    }
}
