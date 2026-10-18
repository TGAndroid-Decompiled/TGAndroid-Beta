package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class cm0 extends AnimatorListenerAdapter {
    public final int f35942a;
    public final boolean f35943b;
    public final xm0 f35944c;

    public cm0(xm0 xm0Var, boolean z10, int i10) {
        this.f35942a = i10;
        this.f35944c = xm0Var;
        this.f35943b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35942a) {
            case 0:
                xm0 xm0Var = this.f35944c;
                AnimatorSet animatorSet = xm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xm0Var.M = null;
                    return;
                }
                return;
            default:
                xm0 xm0Var2 = this.f35944c;
                AnimatorSet animatorSet2 = xm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xm0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35942a) {
            case 0:
                xm0 xm0Var = this.f35944c;
                AnimatorSet animatorSet = xm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35943b) {
                        xm0Var.N.setVisibility(4);
                        return;
                    } else {
                        xm0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                xm0 xm0Var2 = this.f35944c;
                AnimatorSet animatorSet2 = xm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35943b) {
                        xm0Var2.P.setVisibility(4);
                        return;
                    } else {
                        xm0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
