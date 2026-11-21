package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yv0 extends AnimatorListenerAdapter {
    public final int f42584a;
    public final boolean f42585b;
    public final kw0 f42586c;

    public yv0(kw0 kw0Var, int i7, boolean z10) {
        this.f42586c = kw0Var;
        this.f42584a = i7;
        this.f42585b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f42586c.D1;
        int i7 = this.f42584a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kw0 kw0Var = this.f42586c;
        AnimatorSet[] animatorSetArr = kw0Var.D1;
        int i7 = this.f42584a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f42585b) {
                kw0Var.E1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
