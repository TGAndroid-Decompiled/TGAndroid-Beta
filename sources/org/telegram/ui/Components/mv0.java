package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f36109a;
    public final boolean f36110b;
    public final yv0 f36111c;

    public mv0(yv0 yv0Var, int i7, boolean z9) {
        this.f36111c = yv0Var;
        this.f36109a = i7;
        this.f36110b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f36111c.C1;
        int i7 = this.f36109a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yv0 yv0Var = this.f36111c;
        AnimatorSet[] animatorSetArr = yv0Var.C1;
        int i7 = this.f36109a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f36110b) {
                yv0Var.D1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
