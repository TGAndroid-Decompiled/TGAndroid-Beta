package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class cm0 extends AnimatorListenerAdapter {

    public final int f37116a;

    public final boolean f37117b;

    public final xm0 f37118c;

    public cm0(xm0 xm0Var, boolean z10, int i10) {
        this.f37116a = i10;
        this.f37118c = xm0Var;
        this.f37117b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37116a) {
            case 0:
                xm0 xm0Var = this.f37118c;
                AnimatorSet animatorSet = xm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xm0Var.I = null;
                    break;
                }
                break;
            default:
                xm0 xm0Var2 = this.f37118c;
                AnimatorSet animatorSet2 = xm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xm0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37116a) {
            case 0:
                xm0 xm0Var = this.f37118c;
                AnimatorSet animatorSet = xm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37117b) {
                        xm0Var.J.setVisibility(4);
                    } else {
                        xm0Var.H.getContentView().setVisibility(4);
                    }
                    break;
                }
                break;
            default:
                xm0 xm0Var2 = this.f37118c;
                AnimatorSet animatorSet2 = xm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37117b) {
                        xm0Var2.L.setVisibility(4);
                    } else {
                        xm0Var2.K.setVisibility(4);
                    }
                    break;
                }
                break;
        }
    }
}
