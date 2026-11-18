package org.telegram.ui.Components;

import android.content.Context;
public final class r7 extends ck0 {
    public boolean f39055f3;
    public final g8 f39056g3;

    public r7(g8 g8Var, Context context) {
        super(context, null);
        this.f39056g3 = g8Var;
    }

    @Override
    public final boolean E0(float f10) {
        g8 g8Var = this.f39056g3;
        if (f10 < g8Var.f35420y1.getY() - g8Var.f35408s1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g8 g8Var = this.f39056g3;
        int i13 = g8Var.f35398m2;
        if (i13 != -1 && !g8Var.n1.f29086o0) {
            this.f39055f3 = true;
            g8Var.f35410t1.h1(i13, g8Var.f35399n2 - g8Var.f35408s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f39055f3 = false;
            g8Var.f35398m2 = -1;
        } else if (g8Var.f35396l2) {
            g8Var.f35396l2 = false;
            this.f39055f3 = true;
            if (g8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f39055f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39055f3) {
            return;
        }
        super.requestLayout();
    }
}
