package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lm0 extends AnimatorListenerAdapter {
    public final int f39318a;
    public final boolean f39319b;
    public final sm0 f39320c;

    public lm0(sm0 sm0Var, boolean z10, int i10) {
        this.f39318a = i10;
        this.f39320c = sm0Var;
        this.f39319b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39318a) {
            case 0:
                sm0 sm0Var = this.f39320c;
                AnimatorSet animatorSet = sm0Var.f41580w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sm0Var.f41580w = null;
                    return;
                }
                return;
            default:
                sm0 sm0Var2 = this.f39320c;
                AnimatorSet animatorSet2 = sm0Var2.f41580w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sm0Var2.f41580w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39318a) {
            case 0:
                sm0 sm0Var = this.f39320c;
                AnimatorSet animatorSet = sm0Var.f41580w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39319b) {
                        sm0Var.f41573r.setVisibility(4);
                        return;
                    } else {
                        sm0Var.f41568n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                sm0 sm0Var2 = this.f39320c;
                AnimatorSet animatorSet2 = sm0Var2.f41580w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39319b) {
                        sm0Var2.f41575s.setVisibility(4);
                        return;
                    } else {
                        sm0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
