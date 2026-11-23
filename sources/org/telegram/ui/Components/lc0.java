package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lc0 extends AnimatorListenerAdapter {
    public final int f37120a;
    public final hi.y7 f37121b;

    public lc0(hi.y7 y7Var, int i7) {
        this.f37120a = i7;
        this.f37121b = y7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37120a) {
            case 0:
                hi.y7 y7Var = this.f37121b;
                AnimatorSet animatorSet = (AnimatorSet) y7Var.f15732e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y7Var.f15732e = null;
                    return;
                }
                return;
            case 1:
                hi.y7 y7Var2 = this.f37121b;
                AnimatorSet animatorSet2 = (AnimatorSet) y7Var2.f15732e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    y7Var2.f15732e = null;
                    return;
                }
                return;
            default:
                hi.y7 y7Var3 = this.f37121b;
                AnimatorSet animatorSet3 = (AnimatorSet) y7Var3.f15732e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    y7Var3.f15732e = null;
                    return;
                }
                return;
        }
    }
}
