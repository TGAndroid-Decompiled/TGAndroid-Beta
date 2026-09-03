package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f23101a;
    public final r2 f23102b;

    public l2(r2 r2Var, int i10) {
        this.f23101a = i10;
        this.f23102b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f23101a) {
            case 0:
                r2 r2Var = this.f23102b;
                r2Var.O3 = 1.0f;
                r2Var.R3 = null;
                r2Var.S3 = null;
                r2Var.T3 = null;
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f23102b;
                r2Var2.P3 = 1.0f;
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f23102b;
                boolean z4 = r2Var3.P2;
                if (r2Var3.N2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z4 ? 1 : 0) + i10;
                if (r2Var3.O2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = r2Var3.f23485o4;
                if (i14 != i13) {
                    r2Var3.A(i14, i13);
                } else {
                    r2Var3.f23507s4 = false;
                    r2Var3.f23495q4 = i14;
                }
                r2Var3.invalidate();
                return;
        }
    }
}
