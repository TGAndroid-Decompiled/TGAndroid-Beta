package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class wv0 extends AnimatorListenerAdapter {
    public final int f41800a;
    public final boolean f41801b;
    public final iw0 f41802c;

    public wv0(iw0 iw0Var, int i7, boolean z10) {
        this.f41802c = iw0Var;
        this.f41800a = i7;
        this.f41801b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f41802c.D1;
        int i7 = this.f41800a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        iw0 iw0Var = this.f41802c;
        AnimatorSet[] animatorSetArr = iw0Var.D1;
        int i7 = this.f41800a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f41801b) {
                iw0Var.E1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
