package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ac0 extends AnimatorListenerAdapter {
    public final int f32955a;
    public final hi.y7 f32956b;

    public ac0(hi.y7 y7Var, int i7) {
        this.f32955a = i7;
        this.f32956b = y7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32955a) {
            case 0:
                hi.y7 y7Var = this.f32956b;
                AnimatorSet animatorSet = (AnimatorSet) y7Var.f15430e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y7Var.f15430e = null;
                    return;
                }
                return;
            case 1:
                hi.y7 y7Var2 = this.f32956b;
                AnimatorSet animatorSet2 = (AnimatorSet) y7Var2.f15430e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    y7Var2.f15430e = null;
                    return;
                }
                return;
            default:
                hi.y7 y7Var3 = this.f32956b;
                AnimatorSet animatorSet3 = (AnimatorSet) y7Var3.f15430e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    y7Var3.f15430e = null;
                    return;
                }
                return;
        }
    }
}
