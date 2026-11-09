package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f36517a;
    public final boolean f36518b;
    public final zv0 f36519c;

    public nv0(zv0 zv0Var, int i7, boolean z9) {
        this.f36519c = zv0Var;
        this.f36517a = i7;
        this.f36518b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f36519c.f41171z1;
        int i7 = this.f36517a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            animatorSetArr[i7] = null;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zv0 zv0Var = this.f36519c;
        AnimatorSet[] animatorSetArr = zv0Var.f41171z1;
        int i7 = this.f36517a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null && animatorSet.equals(animator)) {
            if (!this.f36518b) {
                zv0Var.A1[i7].setVisibility(4);
            }
            animatorSetArr[i7] = null;
        }
    }
}
