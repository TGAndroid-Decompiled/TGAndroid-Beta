package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class co0 extends AnimatorListenerAdapter {
    public final int f35836a;
    public final boolean f35837b;
    public final lo0 f35838c;

    public co0(lo0 lo0Var, boolean z4, int i10) {
        this.f35836a = i10;
        this.f35838c = lo0Var;
        this.f35837b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35836a) {
            case 0:
                lo0 lo0Var = this.f35838c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lo0Var.v = null;
                    return;
                }
                return;
            default:
                lo0 lo0Var2 = this.f35838c;
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
        switch (this.f35836a) {
            case 0:
                lo0 lo0Var = this.f35838c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35837b) {
                        lo0Var.f38732r.setVisibility(4);
                        return;
                    } else {
                        lo0Var.f38727n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                lo0 lo0Var2 = this.f35838c;
                AnimatorSet animatorSet2 = lo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35837b) {
                        lo0Var2.f38734s.setVisibility(4);
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
