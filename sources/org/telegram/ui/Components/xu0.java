package org.telegram.ui.Components;

import android.content.Context;
public final class xu0 extends wu0 {
    public final yu0 G;

    public xu0(yu0 yu0Var, Context context, int i10) {
        super(yu0Var.e, context, i10, false);
        this.G = yu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        yu0 yu0Var = this.G;
        zu0 zu0Var = yu0Var.e;
        int i10 = yu0Var.f30325a;
        int[] iArr = zu0.f30604d2;
        st0 W = zu0Var.W(i10);
        if (W != null && W.f27922r.getVisibility() == 0) {
            yu0Var.d.l();
        }
        if (W != null) {
            js0 js0Var = W.f27924w;
            ai.d9 d9Var = this.f29752s;
            if (d9Var != null && (d9Var.k() || (zu0Var.i0() && this.f29752s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            js0Var.e(z10, true);
        }
    }
}
