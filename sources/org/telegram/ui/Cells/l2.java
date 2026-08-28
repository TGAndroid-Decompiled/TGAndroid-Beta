package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f24645a;
    public final r2 f24646b;

    public l2(r2 r2Var, int i9) {
        this.f24645a = i9;
        this.f24646b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        switch (this.f24645a) {
            case 0:
                r2 r2Var = this.f24646b;
                r2Var.N3 = 1.0f;
                r2Var.Q3 = null;
                r2Var.R3 = null;
                r2Var.S3 = null;
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f24646b;
                r2Var2.O3 = 1.0f;
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f24646b;
                boolean z10 = r2Var3.O2;
                if (r2Var3.M2) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                int i11 = (z10 ? 1 : 0) + i9;
                if (r2Var3.N2) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                int i12 = i11 + i10;
                int i13 = r2Var3.f25021n4;
                if (i13 != i12) {
                    r2Var3.z(i13, i12);
                } else {
                    r2Var3.f25042r4 = false;
                    r2Var3.f25031p4 = i13;
                }
                r2Var3.invalidate();
                return;
        }
    }
}
