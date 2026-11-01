package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class rw0 extends AnimatorListenerAdapter {
    public final int f30092a;
    public final boolean f30093b;
    public final dx0 f30094c;

    public rw0(dx0 dx0Var, int i10, boolean z10) {
        this.f30094c = dx0Var;
        this.f30092a = i10;
        this.f30093b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f30094c.f25638z1;
        int i10 = this.f30092a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i10] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        dx0 dx0Var = this.f30094c;
        AnimatorSet[] animatorSetArr = dx0Var.f25638z1;
        int i10 = this.f30092a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f30093b) {
                dx0Var.A1[i10].setVisibility(4);
            }
            animatorSetArr[i10] = null;
        }
    }
}
