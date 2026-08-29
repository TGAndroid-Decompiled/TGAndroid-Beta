package org.telegram.ui.Components;

import android.content.Context;
public final class s7 extends jl0 {
    public boolean T2;
    public final g8 U2;

    public s7(g8 g8Var, Context context) {
        super(context, null);
        this.U2 = g8Var;
    }

    @Override
    public final boolean E0(float f9) {
        g8 g8Var = this.U2;
        if (f9 < g8Var.A.getY() - g8Var.f28792n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g8 g8Var = this.U2;
        int i14 = g8Var.f28794o0;
        if (i14 != -1 && !g8Var.f28779c.f23612j0) {
            this.T2 = true;
            g8Var.f28797r.h1(i14, g8Var.f28795p0 - g8Var.f28792n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.T2 = false;
            g8Var.f28794o0 = -1;
        } else if (g8Var.f28793n0) {
            g8Var.f28793n0 = false;
            this.T2 = true;
            if (g8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
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
