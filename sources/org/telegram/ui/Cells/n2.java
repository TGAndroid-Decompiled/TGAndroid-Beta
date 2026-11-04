package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f29659a;
    public final t2 f29660b;

    public n2(t2 t2Var, int i3) {
        this.f29659a = i3;
        this.f29660b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        switch (this.f29659a) {
            case 0:
                t2 t2Var = this.f29660b;
                t2Var.W3 = 1.0f;
                t2Var.Z3 = null;
                t2Var.f30469a4 = null;
                t2Var.f30475b4 = null;
                t2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f29660b;
                t2Var2.X3 = 1.0f;
                t2Var2.invalidate();
                return;
            default:
                t2 t2Var3 = this.f29660b;
                boolean z10 = t2Var3.T2;
                if (t2Var3.R2) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                int i11 = (z10 ? 1 : 0) + i3;
                if (t2Var3.S2) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                int i12 = i11 + i10;
                int i13 = t2Var3.f30579w4;
                if (i13 != i12) {
                    t2Var3.G(i13, i12);
                } else {
                    t2Var3.A4 = false;
                    t2Var3.f30591y4 = i13;
                }
                t2Var3.invalidate();
                return;
        }
    }
}
