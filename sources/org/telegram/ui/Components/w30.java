package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w30 extends AnimatorListenerAdapter {
    public final int f30137a;
    public final y30 f30138b;

    public w30(y30 y30Var, int i10) {
        this.f30137a = i10;
        this.f30138b = y30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30137a) {
            case 0:
                y30 y30Var = this.f30138b;
                if (y30Var.V == animator) {
                    y30Var.V = null;
                    y30Var.b();
                    return;
                }
                return;
            default:
                y30 y30Var2 = this.f30138b;
                if (y30Var2.U == animator) {
                    y30Var2.U = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30137a) {
            case 1:
                x30 x30Var = this.f30138b.T;
                if (x30Var != null) {
                    ((org.telegram.ui.gs0) x30Var).f34504a.f31679b0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
