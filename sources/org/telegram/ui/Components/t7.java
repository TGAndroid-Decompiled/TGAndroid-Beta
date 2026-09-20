package org.telegram.ui.Components;

import android.content.Context;
public final class t7 extends vl0 {
    public boolean X2;
    public final i8 Y2;

    public t7(i8 i8Var, Context context) {
        super(context, null);
        this.Y2 = i8Var;
    }

    @Override
    public final boolean F0(float f7) {
        i8 i8Var = this.Y2;
        if (f7 < i8Var.E.getY() - i8Var.f24924n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i8 i8Var = this.Y2;
        int i14 = i8Var.f24932s0;
        if (i14 != -1 && !i8Var.f24912c.f19537n0) {
            this.X2 = true;
            i8Var.f24929r.h1(i14, i8Var.f24933t0 - i8Var.f24924n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.X2 = false;
            i8Var.f24932s0 = -1;
        } else if (i8Var.f24930r0) {
            i8Var.f24930r0 = false;
            this.X2 = true;
            if (i8Var.w0(true)) {
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
