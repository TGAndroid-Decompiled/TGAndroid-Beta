package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ov0 extends AnimatorListenerAdapter {
    public final int f38088a;
    public final boolean f38089b;
    public final bw0 f38090c;

    public ov0(bw0 bw0Var, int i7, boolean z10) {
        this.f38090c = bw0Var;
        this.f38088a = i7;
        this.f38089b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f38090c.D1;
        int i7 = this.f38088a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bw0 bw0Var = this.f38090c;
        AnimatorSet[] animatorSetArr = bw0Var.D1;
        int i7 = this.f38088a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f38089b) {
                bw0Var.E1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
