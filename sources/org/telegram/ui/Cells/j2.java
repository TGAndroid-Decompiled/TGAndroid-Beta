package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f24529a;
    public final p2 f24530b;

    public j2(p2 p2Var, int i10) {
        this.f24529a = i10;
        this.f24530b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f24529a) {
            case 0:
                p2 p2Var = this.f24530b;
                p2Var.N3 = 1.0f;
                p2Var.Q3 = null;
                p2Var.R3 = null;
                p2Var.S3 = null;
                p2Var.invalidate();
                return;
            case 1:
                p2 p2Var2 = this.f24530b;
                p2Var2.O3 = 1.0f;
                p2Var2.invalidate();
                return;
            default:
                p2 p2Var3 = this.f24530b;
                boolean z10 = p2Var3.O2;
                if (p2Var3.M2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (p2Var3.N2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = p2Var3.f24895n4;
                if (i14 != i13) {
                    p2Var3.A(i14, i13);
                } else {
                    p2Var3.f24916r4 = false;
                    p2Var3.f24905p4 = i14;
                }
                p2Var3.invalidate();
                return;
        }
    }
}
