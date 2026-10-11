package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lo0 extends AnimatorListenerAdapter {
    public final int f39741a;
    public final boolean f39742b;
    public final uo0 f39743c;

    public lo0(uo0 uo0Var, boolean z10, int i10) {
        this.f39741a = i10;
        this.f39743c = uo0Var;
        this.f39742b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39741a) {
            case 0:
                uo0 uo0Var = this.f39743c;
                AnimatorSet animatorSet = uo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    uo0Var.v = null;
                    return;
                }
                return;
            default:
                uo0 uo0Var2 = this.f39743c;
                AnimatorSet animatorSet2 = uo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39741a) {
            case 0:
                uo0 uo0Var = this.f39743c;
                AnimatorSet animatorSet = uo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39742b) {
                        uo0Var.f42754r.setVisibility(4);
                        return;
                    } else {
                        uo0Var.f42749n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                uo0 uo0Var2 = this.f39743c;
                AnimatorSet animatorSet2 = uo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39742b) {
                        uo0Var2.f42756s.setVisibility(4);
                        return;
                    } else {
                        uo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
