package org.telegram.ui.Components;

import android.content.Context;
public final class r7 extends ek0 {
    public boolean f39102f3;
    public final f8 f39103g3;

    public r7(f8 f8Var, Context context) {
        super(context, null);
        this.f39103g3 = f8Var;
    }

    @Override
    public final boolean E0(float f10) {
        f8 f8Var = this.f39103g3;
        if (f10 < f8Var.f35145y1.getY() - f8Var.f35133s1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f8 f8Var = this.f39103g3;
        int i13 = f8Var.f35123m2;
        if (i13 != -1 && !f8Var.n1.f29150o0) {
            this.f39102f3 = true;
            f8Var.f35135t1.h1(i13, f8Var.f35124n2 - f8Var.f35133s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f39102f3 = false;
            f8Var.f35123m2 = -1;
        } else if (f8Var.f35121l2) {
            f8Var.f35121l2 = false;
            this.f39102f3 = true;
            if (f8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f39102f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39102f3) {
            return;
        }
        super.requestLayout();
    }
}
