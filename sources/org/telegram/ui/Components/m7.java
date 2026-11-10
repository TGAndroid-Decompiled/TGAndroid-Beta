package org.telegram.ui.Components;

import android.content.Context;
public final class m7 extends pj0 {
    public boolean f35876e3;
    public final a8 f35877f3;

    public m7(a8 a8Var, Context context) {
        super(context, null);
        this.f35877f3 = a8Var;
    }

    @Override
    public final boolean E0(float f10) {
        a8 a8Var = this.f35877f3;
        if (f10 < a8Var.f31766x1.getY() - a8Var.f31754r1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a8 a8Var = this.f35877f3;
        int i13 = a8Var.f31744l2;
        if (i13 != -1 && !a8Var.f31745m1.f27691n0) {
            this.f35876e3 = true;
            a8Var.f31756s1.h1(i13, a8Var.f31746m2 - a8Var.f31754r1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f35876e3 = false;
            a8Var.f31744l2 = -1;
        } else if (a8Var.f31743k2) {
            a8Var.f31743k2 = false;
            this.f35876e3 = true;
            if (a8Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f35876e3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35876e3) {
            return;
        }
        super.requestLayout();
    }
}
