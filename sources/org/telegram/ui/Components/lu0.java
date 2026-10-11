package org.telegram.ui.Components;

import android.content.Context;
public final class lu0 extends aw0 {
    public final dw0 G;

    public lu0(dw0 dw0Var, Context context) {
        super(dw0Var, context, 0, false);
        this.G = dw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        dw0 dw0Var = this.G;
        wu0 W = dw0Var.W(8);
        if (W != null && W.f32744r.getVisibility() == 0) {
            dw0Var.f25695d0.l();
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
