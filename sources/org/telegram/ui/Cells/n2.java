package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f31110a;
    public final t2 f31111b;

    public n2(t2 t2Var, int i7) {
        this.f31110a = i7;
        this.f31111b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f31110a) {
            case 0:
                t2 t2Var = this.f31111b;
                t2Var.W3 = 1.0f;
                t2Var.Z3 = null;
                t2Var.f31847a4 = null;
                t2Var.f31853b4 = null;
                t2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f31111b;
                t2Var2.X3 = 1.0f;
                t2Var2.invalidate();
                return;
            default:
                t2 t2Var3 = this.f31111b;
                boolean z10 = t2Var3.T2;
                if (t2Var3.R2) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                int i11 = (z10 ? 1 : 0) + i7;
                if (t2Var3.S2) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                int i12 = i11 + i10;
                int i13 = t2Var3.f31957w4;
                if (i13 != i12) {
                    t2Var3.F(i13, i12);
                } else {
                    t2Var3.A4 = false;
                    t2Var3.f31969y4 = i13;
                }
                t2Var3.invalidate();
                return;
        }
    }
}
