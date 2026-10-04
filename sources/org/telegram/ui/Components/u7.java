package org.telegram.ui.Components;

import android.content.Context;
public final class u7 extends zl0 {
    public boolean f31318e3;
    public final j8 f31319f3;

    public u7(j8 j8Var, Context context) {
        super(context, null);
        this.f31319f3 = j8Var;
    }

    @Override
    public final boolean F0(float f7) {
        j8 j8Var = this.f31319f3;
        if (f7 < j8Var.E.getY() - j8Var.f27643n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.f31319f3;
        int i14 = j8Var.f27651s0;
        if (i14 != -1 && !j8Var.f27630c.f21281n0) {
            this.f31318e3 = true;
            j8Var.f27648r.h1(i14, j8Var.f27652t0 - j8Var.f27643n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f31318e3 = false;
            j8Var.f27651s0 = -1;
        } else if (j8Var.f27649r0) {
            j8Var.f27649r0 = false;
            this.f31318e3 = true;
            if (j8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f31318e3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f31318e3) {
            return;
        }
        super.requestLayout();
    }
}
