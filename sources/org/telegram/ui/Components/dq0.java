package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class dq0 extends AnimatorListenerAdapter {
    public final int f23717a;
    public final boolean f23718b;
    public final uq0 f23719c;

    public dq0(uq0 uq0Var, boolean z10, int i10) {
        this.f23717a = i10;
        this.f23719c = uq0Var;
        this.f23718b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23717a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f23719c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var = this.f23719c;
                if (animator.equals(uq0Var.f28905y)) {
                    uq0Var.f28905y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23717a) {
            case 0:
                uq0 uq0Var = this.f23719c;
                AnimatorSet[] animatorSetArr = uq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23718b) {
                        uq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.f23719c;
                FrameLayout frameLayout = uq0Var2.h;
                if (animator.equals(uq0Var2.f28905y)) {
                    if (!this.f23718b) {
                        uq0Var2.f28877c.setVisibility(4);
                        FrameLayout frameLayout2 = uq0Var2.f28878c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        uq0Var2.f28881f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    uq0Var2.f28905y = null;
                    return;
                }
                return;
        }
    }
}
