package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lc0 extends AnimatorListenerAdapter {
    public final int f37158a;
    public final hi.x7 f37159b;

    public lc0(hi.x7 x7Var, int i7) {
        this.f37158a = i7;
        this.f37159b = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37158a) {
            case 0:
                hi.x7 x7Var = this.f37159b;
                AnimatorSet animatorSet = (AnimatorSet) x7Var.f15756e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x7Var.f15756e = null;
                    return;
                }
                return;
            case 1:
                hi.x7 x7Var2 = this.f37159b;
                AnimatorSet animatorSet2 = (AnimatorSet) x7Var2.f15756e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x7Var2.f15756e = null;
                    return;
                }
                return;
            default:
                hi.x7 x7Var3 = this.f37159b;
                AnimatorSet animatorSet3 = (AnimatorSet) x7Var3.f15756e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x7Var3.f15756e = null;
                    return;
                }
                return;
        }
    }
}
