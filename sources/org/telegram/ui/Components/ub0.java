package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ub0 extends AnimatorListenerAdapter {
    public final int f38716a;
    public final gi.z7 f38717b;

    public ub0(gi.z7 z7Var, int i3) {
        this.f38716a = i3;
        this.f38717b = z7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38716a) {
            case 0:
                gi.z7 z7Var = this.f38717b;
                AnimatorSet animatorSet = (AnimatorSet) z7Var.f14045e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z7Var.f14045e = null;
                    return;
                }
                return;
            case 1:
                gi.z7 z7Var2 = this.f38717b;
                AnimatorSet animatorSet2 = (AnimatorSet) z7Var2.f14045e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z7Var2.f14045e = null;
                    return;
                }
                return;
            default:
                gi.z7 z7Var3 = this.f38717b;
                AnimatorSet animatorSet3 = (AnimatorSet) z7Var3.f14045e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    z7Var3.f14045e = null;
                    return;
                }
                return;
        }
    }
}
