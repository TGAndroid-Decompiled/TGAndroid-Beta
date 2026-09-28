package org.telegram.ui.Components;

import android.content.Context;
public final class u7 extends yl0 {
    public boolean X2;
    public final j8 Y2;

    public u7(j8 j8Var, Context context) {
        super(context, null);
        this.Y2 = j8Var;
    }

    @Override
    public final boolean E0(float f7) {
        j8 j8Var = this.Y2;
        if (f7 < j8Var.E.getY() - j8Var.f25345n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j8 j8Var = this.Y2;
        int i14 = j8Var.f25353s0;
        if (i14 != -1 && !j8Var.f25333c.f19556n0) {
            this.X2 = true;
            j8Var.f25350r.h1(i14, j8Var.f25354t0 - j8Var.f25345n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            j8Var.f25353s0 = -1;
        } else if (j8Var.f25351r0) {
            j8Var.f25351r0 = false;
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
