package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mo0 extends AnimatorListenerAdapter {
    public final int f39957a;
    public final boolean f39958b;
    public final vo0 f39959c;

    public mo0(vo0 vo0Var, boolean z10, int i10) {
        this.f39957a = i10;
        this.f39959c = vo0Var;
        this.f39958b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39957a) {
            case 0:
                vo0 vo0Var = this.f39959c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vo0Var.v = null;
                    return;
                }
                return;
            default:
                vo0 vo0Var2 = this.f39959c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39957a) {
            case 0:
                vo0 vo0Var = this.f39959c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39958b) {
                        vo0Var.f42941r.setVisibility(4);
                        return;
                    } else {
                        vo0Var.f42936n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                vo0 vo0Var2 = this.f39959c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39958b) {
                        vo0Var2.f42943s.setVisibility(4);
                        return;
                    } else {
                        vo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
