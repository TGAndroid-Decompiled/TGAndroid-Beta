package org.telegram.ui.Components;

import android.content.Context;
public final class l7 extends tj0 {
    public boolean f35615f3;
    public final z7 f35616g3;

    public l7(z7 z7Var, Context context) {
        super(context, null);
        this.f35616g3 = z7Var;
    }

    @Override
    public final boolean E0(float f10) {
        z7 z7Var = this.f35616g3;
        if (f10 < z7Var.f40970v1.getY() - z7Var.f40958p1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        z7 z7Var = this.f35616g3;
        int i13 = z7Var.f40949j2;
        if (i13 != -1 && !z7Var.k1.f27728o0) {
            this.f35615f3 = true;
            z7Var.f40960q1.h1(i13, z7Var.f40950k2 - z7Var.f40958p1.getPaddingTop());
            super.onLayout(false, i3, i10, i11, i12);
            this.f35615f3 = false;
            z7Var.f40949j2 = -1;
        } else if (z7Var.f40947i2) {
            z7Var.f40947i2 = false;
            this.f35615f3 = true;
            if (z7Var.S0(true)) {
                super.onLayout(false, i3, i10, i11, i12);
            }
            this.f35615f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35615f3) {
            return;
        }
        super.requestLayout();
    }
}
