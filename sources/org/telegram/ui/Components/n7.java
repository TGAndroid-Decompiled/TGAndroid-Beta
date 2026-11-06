package org.telegram.ui.Components;

import android.content.Context;
public final class n7 extends pj0 {
    public boolean f36242e3;
    public final b8 f36243f3;

    public n7(b8 b8Var, Context context) {
        super(context, null);
        this.f36243f3 = b8Var;
    }

    @Override
    public final boolean E0(float f10) {
        b8 b8Var = this.f36243f3;
        if (f10 < b8Var.f32091u1.getY() - b8Var.f32079o1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b8 b8Var = this.f36243f3;
        int i13 = b8Var.f32070i2;
        if (i13 != -1 && !b8Var.f32071j1.f27677n0) {
            this.f36242e3 = true;
            b8Var.f32081p1.h1(i13, b8Var.f32072j2 - b8Var.f32079o1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f36242e3 = false;
            b8Var.f32070i2 = -1;
        } else if (b8Var.f32068h2) {
            b8Var.f32068h2 = false;
            this.f36242e3 = true;
            if (b8Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f36242e3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36242e3) {
            return;
        }
        super.requestLayout();
    }
}
