package org.telegram.ui.Components;

import android.content.Context;
public final class v7 extends ll0 {
    public boolean X2;
    public final k8 Y2;

    public v7(k8 k8Var, Context context) {
        super(context, null);
        this.Y2 = k8Var;
    }

    @Override
    public final boolean E0(float f7) {
        k8 k8Var = this.Y2;
        if (f7 < k8Var.E.getY() - k8Var.f27756n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.Y2;
        int i14 = k8Var.f27764s0;
        if (i14 != -1 && !k8Var.f27743c.f21130n0) {
            this.X2 = true;
            k8Var.f27761r.h1(i14, k8Var.f27765t0 - k8Var.f27756n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            k8Var.f27764s0 = -1;
        } else if (k8Var.f27762r0) {
            k8Var.f27762r0 = false;
            this.X2 = true;
            if (k8Var.w0(true)) {
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
