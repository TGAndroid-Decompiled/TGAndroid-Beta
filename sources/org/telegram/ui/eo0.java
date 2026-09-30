package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class eo0 extends AnimatorListenerAdapter {
    public final int f33531a;
    public final boolean f33532b;
    public final no0 f33533c;

    public eo0(no0 no0Var, boolean z10, int i10) {
        this.f33531a = i10;
        this.f33533c = no0Var;
        this.f33532b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33531a) {
            case 0:
                no0 no0Var = this.f33533c;
                AnimatorSet animatorSet = no0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    no0Var.v = null;
                    return;
                }
                return;
            default:
                no0 no0Var2 = this.f33533c;
                AnimatorSet animatorSet2 = no0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    no0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33531a) {
            case 0:
                no0 no0Var = this.f33533c;
                AnimatorSet animatorSet = no0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33532b) {
                        no0Var.f36076r.setVisibility(4);
                        return;
                    } else {
                        no0Var.f36071n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                no0 no0Var2 = this.f33533c;
                AnimatorSet animatorSet2 = no0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f33532b) {
                        no0Var2.f36078s.setVisibility(4);
                        return;
                    } else {
                        no0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
