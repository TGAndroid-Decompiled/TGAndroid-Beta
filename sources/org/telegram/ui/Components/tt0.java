package org.telegram.ui.Components;

import android.content.Context;
public final class tt0 extends iv0 {
    public final lv0 G;

    public tt0(lv0 lv0Var, Context context) {
        super(lv0Var, context, 0, false);
        this.G = lv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        lv0 lv0Var = this.G;
        eu0 W = lv0Var.W(8);
        if (W != null && W.f24129r.getVisibility() == 0) {
            lv0Var.f26173d0.l();
        }
        if (W != null) {
            vs0 vs0Var = W.f24131w;
            ai.d9 d9Var = this.f25233s;
            if (d9Var != null && (d9Var.k() || (lv0Var.i0() && this.f25233s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            vs0Var.e(z10, true);
        }
    }
}
