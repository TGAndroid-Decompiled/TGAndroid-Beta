package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class om0 extends AnimatorListenerAdapter {
    public final int f39233a;
    public final boolean f39234b;
    public final kn0 f39235c;

    public om0(kn0 kn0Var, boolean z10, int i10) {
        this.f39233a = i10;
        this.f39235c = kn0Var;
        this.f39234b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39233a) {
            case 0:
                kn0 kn0Var = this.f39235c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kn0Var.M = null;
                    return;
                }
                return;
            default:
                kn0 kn0Var2 = this.f39235c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39233a) {
            case 0:
                kn0 kn0Var = this.f39235c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39234b) {
                        kn0Var.N.setVisibility(4);
                        return;
                    } else {
                        kn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                kn0 kn0Var2 = this.f39235c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39234b) {
                        kn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        kn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
