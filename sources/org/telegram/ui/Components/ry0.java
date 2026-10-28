package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ry0 extends AnimatorListenerAdapter {
    public final int f32399a;
    public final boolean f32400b;
    public final dz0 f32401c;

    public ry0(dz0 dz0Var, int i10, boolean z10) {
        this.f32401c = dz0Var;
        this.f32399a = i10;
        this.f32400b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f32401c.I;
        int i10 = this.f32399a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i10] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        dz0 dz0Var = this.f32401c;
        AnimatorSet[] animatorSetArr = dz0Var.I;
        int i10 = this.f32399a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f32400b) {
                dz0Var.J[i10].setVisibility(4);
            }
            animatorSetArr[i10] = null;
        }
    }
}
