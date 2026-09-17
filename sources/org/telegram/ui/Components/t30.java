package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f30525a;
    public final v30 f30526b;

    public t30(v30 v30Var, int i10) {
        this.f30525a = i10;
        this.f30526b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30525a) {
            case 0:
                v30 v30Var = this.f30526b;
                if (v30Var.f31076b0 == animator) {
                    v30Var.f31076b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f30526b;
                if (v30Var2.f31074a0 == animator) {
                    v30Var2.f31074a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30525a) {
            case 1:
                u30 u30Var = this.f30526b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.us0) u30Var).f41216a.f33550e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
