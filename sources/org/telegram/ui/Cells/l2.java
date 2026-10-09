package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f22416a;
    public final s2 f22417b;

    public l2(s2 s2Var, int i10) {
        this.f22416a = i10;
        this.f22417b = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f22416a) {
            case 0:
                s2 s2Var = this.f22417b;
                s2Var.V3 = 1.0f;
                s2Var.Y3 = null;
                s2Var.Z3 = null;
                s2Var.f22769a4 = null;
                s2Var.invalidate();
                return;
            case 1:
                s2 s2Var2 = this.f22417b;
                s2Var2.W3 = 1.0f;
                s2Var2.invalidate();
                return;
            default:
                s2 s2Var3 = this.f22417b;
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
                int i14 = s2Var3.f22874v4;
                if (i14 != i13) {
                    s2Var3.B(i14, i13);
                } else {
                    s2Var3.f22896z4 = false;
                    s2Var3.f22886x4 = i14;
                }
                s2Var3.invalidate();
                return;
        }
    }
}
