package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f20604a;
    public final s2 f20605b;

    public l2(s2 s2Var, int i10) {
        this.f20604a = i10;
        this.f20605b = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f20604a) {
            case 0:
                s2 s2Var = this.f20605b;
                s2Var.R3 = 1.0f;
                s2Var.U3 = null;
                s2Var.V3 = null;
                s2Var.W3 = null;
                s2Var.invalidate();
                return;
            case 1:
                s2 s2Var2 = this.f20605b;
                s2Var2.S3 = 1.0f;
                s2Var2.invalidate();
                return;
            default:
                s2 s2Var3 = this.f20605b;
                boolean z10 = s2Var3.S2;
                if (s2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (s2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = s2Var3.f21026r4;
                if (i14 != i13) {
                    s2Var3.z(i14, i13);
                } else {
                    s2Var3.f21047v4 = false;
                    s2Var3.f21037t4 = i14;
                }
                s2Var3.invalidate();
                return;
        }
    }
}
