package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f36120a;
    public final boolean f36121b;
    public final yv0 f36122c;

    public mv0(yv0 yv0Var, int i7, boolean z9) {
        this.f36122c = yv0Var;
        this.f36120a = i7;
        this.f36121b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f36122c.f40803z1;
        int i7 = this.f36120a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yv0 yv0Var = this.f36122c;
        AnimatorSet[] animatorSetArr = yv0Var.f40803z1;
        int i7 = this.f36120a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f36121b) {
                yv0Var.A1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
