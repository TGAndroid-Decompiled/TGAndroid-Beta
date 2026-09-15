package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class no0 extends AnimatorListenerAdapter {
    public final int f36018a;
    public final boolean f36019b;
    public final wo0 f36020c;

    public no0(wo0 wo0Var, boolean z10, int i10) {
        this.f36018a = i10;
        this.f36020c = wo0Var;
        this.f36019b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36018a) {
            case 0:
                wo0 wo0Var = this.f36020c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wo0Var.v = null;
                    return;
                }
                return;
            default:
                wo0 wo0Var2 = this.f36020c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36018a) {
            case 0:
                wo0 wo0Var = this.f36020c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36019b) {
                        wo0Var.f39333r.setVisibility(4);
                        return;
                    } else {
                        wo0Var.f39328n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                wo0 wo0Var2 = this.f36020c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36019b) {
                        wo0Var2.f39335s.setVisibility(4);
                        return;
                    } else {
                        wo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
