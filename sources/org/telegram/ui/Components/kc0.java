package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f36737a;
    public final hi.y7 f36738b;

    public kc0(hi.y7 y7Var, int i7) {
        this.f36737a = i7;
        this.f36738b = y7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36737a) {
            case 0:
                hi.y7 y7Var = this.f36738b;
                AnimatorSet animatorSet = (AnimatorSet) y7Var.f15776e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y7Var.f15776e = null;
                    return;
                }
                return;
            case 1:
                hi.y7 y7Var2 = this.f36738b;
                AnimatorSet animatorSet2 = (AnimatorSet) y7Var2.f15776e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    y7Var2.f15776e = null;
                    return;
                }
                return;
            default:
                hi.y7 y7Var3 = this.f36738b;
                AnimatorSet animatorSet3 = (AnimatorSet) y7Var3.f15776e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    y7Var3.f15776e = null;
                    return;
                }
                return;
        }
    }
}
