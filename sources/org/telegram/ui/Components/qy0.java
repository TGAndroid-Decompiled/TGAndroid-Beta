package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class qy0 extends AnimatorListenerAdapter {
    public final int f32060a;
    public final boolean f32061b;
    public final cz0 f32062c;

    public qy0(cz0 cz0Var, int i10, boolean z10) {
        this.f32062c = cz0Var;
        this.f32060a = i10;
        this.f32061b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f32062c.I;
        int i10 = this.f32060a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i10] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cz0 cz0Var = this.f32062c;
        AnimatorSet[] animatorSetArr = cz0Var.I;
        int i10 = this.f32060a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f32061b) {
                cz0Var.J[i10].setVisibility(4);
            }
            animatorSetArr[i10] = null;
        }
    }
}
