package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f28277a;
    public final v30 f28278b;

    public t30(v30 v30Var, int i10) {
        this.f28277a = i10;
        this.f28278b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28277a) {
            case 0:
                v30 v30Var = this.f28278b;
                if (v30Var.f28916b0 == animator) {
                    v30Var.f28916b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f28278b;
                if (v30Var2.f28914a0 == animator) {
                    v30Var2.f28914a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28277a) {
            case 1:
                u30 u30Var = this.f28278b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.vs0) u30Var).f38596a.f31221e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
