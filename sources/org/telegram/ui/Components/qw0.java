package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class qw0 extends AnimatorListenerAdapter {
    public final int f29756a;
    public final boolean f29757b;
    public final cx0 f29758c;

    public qw0(cx0 cx0Var, int i10, boolean z10) {
        this.f29758c = cx0Var;
        this.f29756a = i10;
        this.f29757b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f29758c.f25225z1;
        int i10 = this.f29756a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i10] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cx0 cx0Var = this.f29758c;
        AnimatorSet[] animatorSetArr = cx0Var.f25225z1;
        int i10 = this.f29756a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f29757b) {
                cx0Var.A1[i10].setVisibility(4);
            }
            animatorSetArr[i10] = null;
        }
    }
}
