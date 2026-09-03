package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class co0 extends AnimatorListenerAdapter {
    public final int f33203a;
    public final boolean f33204b;
    public final lo0 f33205c;

    public co0(lo0 lo0Var, boolean z4, int i10) {
        this.f33203a = i10;
        this.f33205c = lo0Var;
        this.f33204b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33203a) {
            case 0:
                lo0 lo0Var = this.f33205c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lo0Var.v = null;
                    return;
                }
                return;
            default:
                lo0 lo0Var2 = this.f33205c;
                AnimatorSet animatorSet2 = lo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    lo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33203a) {
            case 0:
                lo0 lo0Var = this.f33205c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33204b) {
                        lo0Var.f35839r.setVisibility(4);
                        return;
                    } else {
                        lo0Var.f35834n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                lo0 lo0Var2 = this.f33205c;
                AnimatorSet animatorSet2 = lo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f33204b) {
                        lo0Var2.f35841s.setVisibility(4);
                        return;
                    } else {
                        lo0Var2.R.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
