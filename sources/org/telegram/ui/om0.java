package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class om0 extends AnimatorListenerAdapter {
    public final int f42122a;
    public final boolean f42123b;
    public final kn0 f42124c;

    public om0(kn0 kn0Var, boolean z10, int i10) {
        this.f42122a = i10;
        this.f42124c = kn0Var;
        this.f42123b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f42122a) {
            case 0:
                kn0 kn0Var = this.f42124c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kn0Var.M = null;
                    return;
                }
                return;
            default:
                kn0 kn0Var2 = this.f42124c;
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
        switch (this.f42122a) {
            case 0:
                kn0 kn0Var = this.f42124c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f42123b) {
                        kn0Var.N.setVisibility(4);
                        return;
                    } else {
                        kn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                kn0 kn0Var2 = this.f42124c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f42123b) {
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
