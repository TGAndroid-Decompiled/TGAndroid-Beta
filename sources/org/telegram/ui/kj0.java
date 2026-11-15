package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class kj0 extends AnimatorListenerAdapter {
    public final int f48665a;
    public final boolean f48666b;
    public final ek0 f48667c;

    public kj0(ek0 ek0Var, boolean z10, int i7) {
        this.f48665a = i7;
        this.f48667c = ek0Var;
        this.f48666b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f48665a) {
            case 0:
                ek0 ek0Var = this.f48667c;
                AnimatorSet animatorSet = ek0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ek0Var.N = null;
                    return;
                }
                return;
            default:
                ek0 ek0Var2 = this.f48667c;
                AnimatorSet animatorSet2 = ek0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ek0Var2.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48665a) {
            case 0:
                ek0 ek0Var = this.f48667c;
                AnimatorSet animatorSet = ek0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f48666b) {
                        ek0Var.O.setVisibility(4);
                        return;
                    } else {
                        ek0Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ek0 ek0Var2 = this.f48667c;
                AnimatorSet animatorSet2 = ek0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f48666b) {
                        ek0Var2.Q.setVisibility(4);
                        return;
                    } else {
                        ek0Var2.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
