package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mm0 extends AnimatorListenerAdapter {
    public final int f35356a;
    public final boolean f35357b;
    public final in0 f35358c;

    public mm0(in0 in0Var, boolean z10, int i10) {
        this.f35356a = i10;
        this.f35358c = in0Var;
        this.f35357b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35356a) {
            case 0:
                in0 in0Var = this.f35358c;
                AnimatorSet animatorSet = in0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    in0Var.M = null;
                    return;
                }
                return;
            default:
                in0 in0Var2 = this.f35358c;
                AnimatorSet animatorSet2 = in0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    in0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35356a) {
            case 0:
                in0 in0Var = this.f35358c;
                AnimatorSet animatorSet = in0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35357b) {
                        in0Var.N.setVisibility(4);
                        return;
                    } else {
                        in0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                in0 in0Var2 = this.f35358c;
                AnimatorSet animatorSet2 = in0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35357b) {
                        in0Var2.P.setVisibility(4);
                        return;
                    } else {
                        in0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
