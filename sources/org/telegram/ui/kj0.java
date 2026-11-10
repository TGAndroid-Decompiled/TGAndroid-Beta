package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class kj0 extends AnimatorListenerAdapter {
    public final int f47315a;
    public final boolean f47316b;
    public final ek0 f47317c;

    public kj0(ek0 ek0Var, boolean z9, int i7) {
        this.f47315a = i7;
        this.f47317c = ek0Var;
        this.f47316b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47315a) {
            case 0:
                ek0 ek0Var = this.f47317c;
                AnimatorSet animatorSet = ek0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ek0Var.M = null;
                    return;
                }
                return;
            default:
                ek0 ek0Var2 = this.f47317c;
                AnimatorSet animatorSet2 = ek0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ek0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47315a) {
            case 0:
                ek0 ek0Var = this.f47317c;
                AnimatorSet animatorSet = ek0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47316b) {
                        ek0Var.N.setVisibility(4);
                        return;
                    } else {
                        ek0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ek0 ek0Var2 = this.f47317c;
                AnimatorSet animatorSet2 = ek0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47316b) {
                        ek0Var2.P.setVisibility(4);
                        return;
                    } else {
                        ek0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
