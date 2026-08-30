package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class hm0 extends AnimatorListenerAdapter {
    public final int f34915a;
    public final boolean f34916b;
    public final dn0 f34917c;

    public hm0(dn0 dn0Var, boolean z4, int i10) {
        this.f34915a = i10;
        this.f34917c = dn0Var;
        this.f34916b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f34915a) {
            case 0:
                dn0 dn0Var = this.f34917c;
                AnimatorSet animatorSet = dn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dn0Var.J = null;
                    return;
                }
                return;
            default:
                dn0 dn0Var2 = this.f34917c;
                AnimatorSet animatorSet2 = dn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dn0Var2.J = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34915a) {
            case 0:
                dn0 dn0Var = this.f34917c;
                AnimatorSet animatorSet = dn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34916b) {
                        dn0Var.K.setVisibility(4);
                        return;
                    } else {
                        dn0Var.I.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                dn0 dn0Var2 = this.f34917c;
                AnimatorSet animatorSet2 = dn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f34916b) {
                        dn0Var2.M.setVisibility(4);
                        return;
                    } else {
                        dn0Var2.L.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
