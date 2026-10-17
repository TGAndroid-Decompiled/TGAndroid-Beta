package org.telegram.ui.Components;

import android.content.Context;
public final class v7 extends im0 {
    public boolean V2;
    public final k8 W2;

    public v7(k8 k8Var, Context context) {
        super(context, null);
        this.W2 = k8Var;
    }

    @Override
    public final boolean E0(float f7) {
        k8 k8Var = this.W2;
        if (f7 < k8Var.E.getY() - k8Var.f27779n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.W2;
        int i14 = k8Var.f27787s0;
        if (i14 != -1 && !k8Var.f27767c.f21493n0) {
            this.V2 = true;
            k8Var.f27784r.h1(i14, k8Var.f27788t0 - k8Var.f27779n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            k8Var.f27787s0 = -1;
        } else if (k8Var.f27785r0) {
            k8Var.f27785r0 = false;
            this.V2 = true;
            if (k8Var.x0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.V2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
