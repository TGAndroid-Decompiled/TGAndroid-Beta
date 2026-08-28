package org.telegram.ui.Components;

import android.content.Context;
public final class n7 extends wk0 {
    public boolean T2;
    public final c8 U2;

    public n7(c8 c8Var, Context context) {
        super(context, null);
        this.U2 = c8Var;
    }

    @Override
    public final boolean E0(float f10) {
        c8 c8Var = this.U2;
        if (f10 < c8Var.A.getY() - c8Var.f27394n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        c8 c8Var = this.U2;
        int i13 = c8Var.f27396o0;
        if (i13 != -1 && !c8Var.f27381c.f23577j0) {
            this.T2 = true;
            c8Var.f27399r.h1(i13, c8Var.f27397p0 - c8Var.f27394n.getPaddingTop());
            super.onLayout(false, i9, i10, i11, i12);
            this.T2 = false;
            c8Var.f27396o0 = -1;
        } else if (c8Var.f27395n0) {
            c8Var.f27395n0 = false;
            this.T2 = true;
            if (c8Var.v0(true)) {
                super.onLayout(false, i9, i10, i11, i12);
            }
            this.T2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
