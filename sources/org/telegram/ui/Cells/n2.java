package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f29617a;
    public final t2 f29618b;

    public n2(t2 t2Var, int i7) {
        this.f29617a = i7;
        this.f29618b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f29617a) {
            case 0:
                t2 t2Var = this.f29618b;
                t2Var.V3 = 1.0f;
                t2Var.Y3 = null;
                t2Var.Z3 = null;
                t2Var.f30409a4 = null;
                t2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f29618b;
                t2Var2.W3 = 1.0f;
                t2Var2.invalidate();
                return;
            default:
                t2 t2Var3 = this.f29618b;
                boolean z9 = t2Var3.S2;
                if (t2Var3.Q2) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                int i11 = (z9 ? 1 : 0) + i7;
                if (t2Var3.R2) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                int i12 = i11 + i10;
                int i13 = t2Var3.f30512v4;
                if (i13 != i12) {
                    t2Var3.E(i13, i12);
                } else {
                    t2Var3.f30535z4 = false;
                    t2Var3.f30524x4 = i13;
                }
                t2Var3.invalidate();
                return;
        }
    }
}
