package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jc0 extends AnimatorListenerAdapter {
    public final int f36383a;
    public final hi.s8 f36384b;

    public jc0(hi.s8 s8Var, int i7) {
        this.f36383a = i7;
        this.f36384b = s8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36383a) {
            case 0:
                hi.s8 s8Var = this.f36384b;
                AnimatorSet animatorSet = (AnimatorSet) s8Var.f15403e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    s8Var.f15403e = null;
                    return;
                }
                return;
            case 1:
                hi.s8 s8Var2 = this.f36384b;
                AnimatorSet animatorSet2 = (AnimatorSet) s8Var2.f15403e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s8Var2.f15403e = null;
                    return;
                }
                return;
            default:
                hi.s8 s8Var3 = this.f36384b;
                AnimatorSet animatorSet3 = (AnimatorSet) s8Var3.f15403e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s8Var3.f15403e = null;
                    return;
                }
                return;
        }
    }
}
