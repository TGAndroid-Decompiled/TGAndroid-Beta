package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f21262a;
    public final q2 f21263b;

    public k2(q2 q2Var, int i10) {
        this.f21262a = i10;
        this.f21263b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f21262a) {
            case 0:
                q2 q2Var = this.f21263b;
                q2Var.O3 = 1.0f;
                q2Var.R3 = null;
                q2Var.S3 = null;
                q2Var.T3 = null;
                q2Var.invalidate();
                return;
            case 1:
                q2 q2Var2 = this.f21263b;
                q2Var2.P3 = 1.0f;
                q2Var2.invalidate();
                return;
            default:
                q2 q2Var3 = this.f21263b;
                boolean z4 = q2Var3.P2;
                if (q2Var3.N2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z4 ? 1 : 0) + i10;
                if (q2Var3.O2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = q2Var3.f21625o4;
                if (i14 != i13) {
                    q2Var3.A(i14, i13);
                } else {
                    q2Var3.f21647s4 = false;
                    q2Var3.f21635q4 = i14;
                }
                q2Var3.invalidate();
                return;
        }
    }
}
