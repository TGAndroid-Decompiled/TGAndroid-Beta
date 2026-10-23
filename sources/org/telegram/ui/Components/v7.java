package org.telegram.ui.Components;

import android.content.Context;
public final class v7 extends mm0 {
    public boolean Y2;
    public final k8 Z2;

    public v7(k8 k8Var, Context context) {
        super(context, null);
        this.Z2 = k8Var;
    }

    @Override
    public final boolean E0(float f7) {
        k8 k8Var = this.Z2;
        if (f7 < k8Var.f27945y.getY() - k8Var.f27929n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.Z2;
        int i14 = k8Var.f27935r0;
        if (i14 != -1 && !k8Var.f27917c.f21068n0) {
            this.Y2 = true;
            k8Var.f27934r.h1(i14, k8Var.f27937s0 - k8Var.f27929n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.Y2 = false;
            k8Var.f27935r0 = -1;
        } else if (k8Var.f27933q0) {
            k8Var.f27933q0 = false;
            this.Y2 = true;
            if (k8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.Y2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
