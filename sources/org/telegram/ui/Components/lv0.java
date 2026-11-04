package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lv0 extends AnimatorListenerAdapter {
    public final int f35892a;
    public final boolean f35893b;
    public final xv0 f35894c;

    public lv0(xv0 xv0Var, int i3, boolean z10) {
        this.f35894c = xv0Var;
        this.f35892a = i3;
        this.f35893b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f35894c.A1;
        int i3 = this.f35892a;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i3] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xv0 xv0Var = this.f35894c;
        AnimatorSet[] animatorSetArr = xv0Var.A1;
        int i3 = this.f35892a;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f35893b) {
                xv0Var.B1[i3].setVisibility(4);
            }
            animatorSetArr[i3] = null;
        }
    }
}
