package org.telegram.ui.Components;

import android.content.Context;
public final class k7 extends uj0 {
    public boolean f36306f3;
    public final y7 f36307g3;

    public k7(y7 y7Var, Context context) {
        super(context, null);
        this.f36307g3 = y7Var;
    }

    @Override
    public final boolean E0(float f10) {
        y7 y7Var = this.f36307g3;
        if (f10 < y7Var.f41920y1.getY() - y7Var.f41908s1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y7 y7Var = this.f36307g3;
        int i13 = y7Var.f41898m2;
        if (i13 != -1 && !y7Var.n1.f29304o0) {
            this.f36306f3 = true;
            y7Var.f41910t1.h1(i13, y7Var.f41899n2 - y7Var.f41908s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f36306f3 = false;
            y7Var.f41898m2 = -1;
        } else if (y7Var.f41896l2) {
            y7Var.f41896l2 = false;
            this.f36306f3 = true;
            if (y7Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f36306f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36306f3) {
            return;
        }
        super.requestLayout();
    }
}
