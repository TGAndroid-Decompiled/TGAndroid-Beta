package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class uc0 extends AnimatorListenerAdapter {
    public final int f32983a;
    public final kh.z8 f32984b;

    public uc0(kh.z8 z8Var, int i9) {
        this.f32983a = i9;
        this.f32984b = z8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32983a) {
            case 0:
                kh.z8 z8Var = this.f32984b;
                AnimatorSet animatorSet = (AnimatorSet) z8Var.f16469e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z8Var.f16469e = null;
                    return;
                }
                return;
            case 1:
                kh.z8 z8Var2 = this.f32984b;
                AnimatorSet animatorSet2 = (AnimatorSet) z8Var2.f16469e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z8Var2.f16469e = null;
                    return;
                }
                return;
            default:
                kh.z8 z8Var3 = this.f32984b;
                AnimatorSet animatorSet3 = (AnimatorSet) z8Var3.f16469e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    z8Var3.f16469e = null;
                    return;
                }
                return;
        }
    }
}
