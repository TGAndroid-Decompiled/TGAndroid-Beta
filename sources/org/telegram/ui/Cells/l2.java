package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f22524a;
    public final r2 f22525b;

    public l2(r2 r2Var, int i10) {
        this.f22524a = i10;
        this.f22525b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f22524a) {
            case 0:
                r2 r2Var = this.f22525b;
                r2Var.V3 = 1.0f;
                r2Var.Y3 = null;
                r2Var.Z3 = null;
                r2Var.f22807a4 = null;
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f22525b;
                r2Var2.W3 = 1.0f;
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f22525b;
                boolean z10 = r2Var3.S2;
                if (r2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (r2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = r2Var3.f22913v4;
                if (i14 != i13) {
                    r2Var3.A(i14, i13);
                } else {
                    r2Var3.f22935z4 = false;
                    r2Var3.f22925x4 = i14;
                }
                r2Var3.invalidate();
                return;
        }
    }
}
