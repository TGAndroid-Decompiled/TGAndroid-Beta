package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class xv0 extends AnimatorListenerAdapter {
    public final int f42226a;
    public final boolean f42227b;
    public final jw0 f42228c;

    public xv0(jw0 jw0Var, int i7, boolean z10) {
        this.f42228c = jw0Var;
        this.f42226a = i7;
        this.f42227b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f42228c.D1;
        int i7 = this.f42226a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jw0 jw0Var = this.f42228c;
        AnimatorSet[] animatorSetArr = jw0Var.D1;
        int i7 = this.f42226a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f42227b) {
                jw0Var.E1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
