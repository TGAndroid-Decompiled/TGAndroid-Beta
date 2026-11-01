package org.telegram.ui.Components;

import android.content.Context;
public final class j7 extends uk0 {
    public boolean f27295e3;
    public final w7 f27296f3;

    public j7(w7 w7Var, Context context) {
        super(context, null);
        this.f27296f3 = w7Var;
    }

    @Override
    public final boolean E0(float f7) {
        w7 w7Var = this.f27296f3;
        if (f7 < w7Var.f32122u1.getY() - w7Var.f32110o1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w7 w7Var = this.f27296f3;
        int i14 = w7Var.f32100i2;
        if (i14 != -1 && !w7Var.f32101j1.f20498n0) {
            this.f27295e3 = true;
            w7Var.f32112p1.h1(i14, w7Var.f32102j2 - w7Var.f32110o1.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f27295e3 = false;
            w7Var.f32100i2 = -1;
        } else if (w7Var.f32098h2) {
            w7Var.f32098h2 = false;
            this.f27295e3 = true;
            if (w7Var.S0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f27295e3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f27295e3) {
            return;
        }
        super.requestLayout();
    }
}
