package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ej0 extends AnimatorListenerAdapter {
    public final int f44993a;
    public final boolean f44994b;
    public final yj0 f44995c;

    public ej0(yj0 yj0Var, boolean z10, int i3) {
        this.f44993a = i3;
        this.f44995c = yj0Var;
        this.f44994b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f44993a) {
            case 0:
                yj0 yj0Var = this.f44995c;
                AnimatorSet animatorSet = yj0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yj0Var.N = null;
                    return;
                }
                return;
            default:
                yj0 yj0Var2 = this.f44995c;
                AnimatorSet animatorSet2 = yj0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yj0Var2.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44993a) {
            case 0:
                yj0 yj0Var = this.f44995c;
                AnimatorSet animatorSet = yj0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f44994b) {
                        yj0Var.O.setVisibility(4);
                        return;
                    } else {
                        yj0Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                yj0 yj0Var2 = this.f44995c;
                AnimatorSet animatorSet2 = yj0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f44994b) {
                        yj0Var2.Q.setVisibility(4);
                        return;
                    } else {
                        yj0Var2.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
