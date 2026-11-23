package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yv0 extends AnimatorListenerAdapter {
    public final int f42576a;
    public final boolean f42577b;
    public final kw0 f42578c;

    public yv0(kw0 kw0Var, int i7, boolean z10) {
        this.f42578c = kw0Var;
        this.f42576a = i7;
        this.f42577b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f42578c.D1;
        int i7 = this.f42576a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kw0 kw0Var = this.f42578c;
        AnimatorSet[] animatorSetArr = kw0Var.D1;
        int i7 = this.f42576a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f42577b) {
                kw0Var.E1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
