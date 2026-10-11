package org.telegram.ui.Components;

import android.content.Context;
public final class w7 extends sm0 {
    public boolean V2;
    public final l8 W2;

    public w7(l8 l8Var, Context context) {
        super(context, null);
        this.W2 = l8Var;
    }

    @Override
    public final boolean E0(float f7) {
        l8 l8Var = this.W2;
        if (f7 < l8Var.E.getY() - l8Var.f28212n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l8 l8Var = this.W2;
        int i14 = l8Var.f28220s0;
        if (i14 != -1 && !l8Var.f28199c.f21286n0) {
            this.V2 = true;
            l8Var.f28217r.h1(i14, l8Var.f28221t0 - l8Var.f28212n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            l8Var.f28220s0 = -1;
        } else if (l8Var.f28218r0) {
            l8Var.f28218r0 = false;
            this.V2 = true;
            if (l8Var.x0(true)) {
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
