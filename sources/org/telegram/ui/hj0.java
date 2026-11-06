package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class hj0 extends AnimatorListenerAdapter {
    public final int f46394a;
    public final boolean f46395b;
    public final bk0 f46396c;

    public hj0(bk0 bk0Var, boolean z9, int i7) {
        this.f46394a = i7;
        this.f46396c = bk0Var;
        this.f46395b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f46394a) {
            case 0:
                bk0 bk0Var = this.f46396c;
                AnimatorSet animatorSet = bk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bk0Var.M = null;
                    return;
                }
                return;
            default:
                bk0 bk0Var2 = this.f46396c;
                AnimatorSet animatorSet2 = bk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bk0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46394a) {
            case 0:
                bk0 bk0Var = this.f46396c;
                AnimatorSet animatorSet = bk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f46395b) {
                        bk0Var.N.setVisibility(4);
                        return;
                    } else {
                        bk0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                bk0 bk0Var2 = this.f46396c;
                AnimatorSet animatorSet2 = bk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f46395b) {
                        bk0Var2.P.setVisibility(4);
                        return;
                    } else {
                        bk0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
