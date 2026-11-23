package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class nj0 extends AnimatorListenerAdapter {
    public final int f50204a;
    public final boolean f50205b;
    public final hk0 f50206c;

    public nj0(hk0 hk0Var, boolean z10, int i7) {
        this.f50204a = i7;
        this.f50206c = hk0Var;
        this.f50205b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f50204a) {
            case 0:
                hk0 hk0Var = this.f50206c;
                AnimatorSet animatorSet = hk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hk0Var.N = null;
                    return;
                }
                return;
            default:
                hk0 hk0Var2 = this.f50206c;
                AnimatorSet animatorSet2 = hk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hk0Var2.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50204a) {
            case 0:
                hk0 hk0Var = this.f50206c;
                AnimatorSet animatorSet = hk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f50205b) {
                        hk0Var.O.setVisibility(4);
                        return;
                    } else {
                        hk0Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                hk0 hk0Var2 = this.f50206c;
                AnimatorSet animatorSet2 = hk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f50205b) {
                        hk0Var2.Q.setVisibility(4);
                        return;
                    } else {
                        hk0Var2.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
