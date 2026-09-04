package org.telegram.ui.Components;

import android.content.Context;
public final class vu0 extends uu0 {
    public final wu0 G;

    public vu0(wu0 wu0Var, Context context, int i10) {
        super(wu0Var.f32345e, context, i10, false);
        this.G = wu0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        wu0 wu0Var = this.G;
        xu0 xu0Var = wu0Var.f32345e;
        int i10 = wu0Var.f32342a;
        int[] iArr = xu0.f32673d2;
        qt0 W = xu0Var.W(i10);
        if (W != null && W.f29821r.getVisibility() == 0) {
            wu0Var.d.l();
        }
        if (W != null) {
            hs0 hs0Var = W.f29823w;
            bi.l8 l8Var = this.f30984s;
            if (l8Var != null && (l8Var.k() || (xu0Var.i0() && this.f30984s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            hs0Var.e(z10, true);
        }
    }
}
