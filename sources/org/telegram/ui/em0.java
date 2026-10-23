package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class em0 extends AnimatorListenerAdapter {
    public final int f36992a;
    public final boolean f36993b;
    public final an0 f36994c;

    public em0(an0 an0Var, boolean z10, int i10) {
        this.f36992a = i10;
        this.f36994c = an0Var;
        this.f36993b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36992a) {
            case 0:
                an0 an0Var = this.f36994c;
                AnimatorSet animatorSet = an0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    an0Var.M = null;
                    return;
                }
                return;
            default:
                an0 an0Var2 = this.f36994c;
                AnimatorSet animatorSet2 = an0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    an0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36992a) {
            case 0:
                an0 an0Var = this.f36994c;
                AnimatorSet animatorSet = an0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36993b) {
                        an0Var.N.setVisibility(4);
                        return;
                    } else {
                        an0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                an0 an0Var2 = this.f36994c;
                AnimatorSet animatorSet2 = an0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36993b) {
                        an0Var2.P.setVisibility(4);
                        return;
                    } else {
                        an0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
