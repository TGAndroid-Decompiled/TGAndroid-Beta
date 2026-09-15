package org.telegram.ui.Components;

import android.content.Context;
public final class s7 extends ll0 {
    public boolean X2;
    public final h8 Y2;

    public s7(h8 h8Var, Context context) {
        super(context, null);
        this.Y2 = h8Var;
    }

    @Override
    public final boolean E0(float f7) {
        h8 h8Var = this.Y2;
        if (f7 < h8Var.E.getY() - h8Var.f24566n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h8 h8Var = this.Y2;
        int i14 = h8Var.f24574s0;
        if (i14 != -1 && !h8Var.f24554c.f19316n0) {
            this.X2 = true;
            h8Var.f24571r.h1(i14, h8Var.f24575t0 - h8Var.f24566n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            h8Var.f24574s0 = -1;
        } else if (h8Var.f24572r0) {
            h8Var.f24572r0 = false;
            this.X2 = true;
            if (h8Var.w0(true)) {
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
