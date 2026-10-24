package org.telegram.ui.Components;

import android.content.Context;
public final class t7 extends lm0 {
    public boolean Y2;
    public final i8 Z2;

    public t7(i8 i8Var, Context context) {
        super(context, null);
        this.Z2 = i8Var;
    }

    @Override
    public final boolean E0(float f7) {
        i8 i8Var = this.Z2;
        if (f7 < i8Var.f27356y.getY() - i8Var.f27340n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i8 i8Var = this.Z2;
        int i14 = i8Var.f27346r0;
        if (i14 != -1 && !i8Var.f27328c.f21069n0) {
            this.Y2 = true;
            i8Var.f27345r.h1(i14, i8Var.f27348s0 - i8Var.f27340n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.Y2 = false;
            i8Var.f27346r0 = -1;
        } else if (i8Var.f27344q0) {
            i8Var.f27344q0 = false;
            this.Y2 = true;
            if (i8Var.D0(true)) {
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
