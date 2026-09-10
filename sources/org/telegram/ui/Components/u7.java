package org.telegram.ui.Components;

import android.content.Context;
public final class u7 extends vl0 {
    public boolean X2;
    public final j8 Y2;

    public u7(j8 j8Var, Context context) {
        super(context, null);
        this.Y2 = j8Var;
    }

    @Override
    public final boolean E0(float f7) {
        j8 j8Var = this.Y2;
        if (f7 < j8Var.E.getY() - j8Var.f24291n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.Y2;
        int i14 = j8Var.f24299s0;
        if (i14 != -1 && !j8Var.f24279c.f18389n0) {
            this.X2 = true;
            j8Var.f24296r.h1(i14, j8Var.f24300t0 - j8Var.f24291n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            j8Var.f24299s0 = -1;
        } else if (j8Var.f24297r0) {
            j8Var.f24297r0 = false;
            this.X2 = true;
            if (j8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.X2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
