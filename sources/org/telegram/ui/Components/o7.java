package org.telegram.ui.Components;

import android.content.Context;
public final class o7 extends sl0 {
    public boolean U2;
    public final c8 V2;

    public o7(c8 c8Var, Context context) {
        super(context, null);
        this.V2 = c8Var;
    }

    @Override
    public final boolean E0(float f10) {
        c8 c8Var = this.V2;
        if (f10 < c8Var.B.getY() - c8Var.f25817n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        c8 c8Var = this.V2;
        int i14 = c8Var.f25820p0;
        if (i14 != -1 && !c8Var.f25804c.f21548k0) {
            this.U2 = true;
            c8Var.f25822r.h1(i14, c8Var.f25821q0 - c8Var.f25817n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.U2 = false;
            c8Var.f25820p0 = -1;
        } else if (c8Var.f25819o0) {
            c8Var.f25819o0 = false;
            this.U2 = true;
            if (c8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.U2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
