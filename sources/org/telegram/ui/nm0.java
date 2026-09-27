package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class nm0 extends AnimatorListenerAdapter {
    public final int f36048a;
    public final boolean f36049b;
    public final jn0 f36050c;

    public nm0(jn0 jn0Var, boolean z10, int i10) {
        this.f36048a = i10;
        this.f36050c = jn0Var;
        this.f36049b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36048a) {
            case 0:
                jn0 jn0Var = this.f36050c;
                AnimatorSet animatorSet = jn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jn0Var.M = null;
                    return;
                }
                return;
            default:
                jn0 jn0Var2 = this.f36050c;
                AnimatorSet animatorSet2 = jn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36048a) {
            case 0:
                jn0 jn0Var = this.f36050c;
                AnimatorSet animatorSet = jn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36049b) {
                        jn0Var.N.setVisibility(4);
                        return;
                    } else {
                        jn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                jn0 jn0Var2 = this.f36050c;
                AnimatorSet animatorSet2 = jn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36049b) {
                        jn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        jn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
