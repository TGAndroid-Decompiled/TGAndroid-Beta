package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class dq0 extends AnimatorListenerAdapter {
    public final int f23628a;
    public final boolean f23629b;
    public final uq0 f23630c;

    public dq0(uq0 uq0Var, boolean z10, int i10) {
        this.f23628a = i10;
        this.f23630c = uq0Var;
        this.f23629b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23628a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f23630c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var = this.f23630c;
                if (animator.equals(uq0Var.f28835y)) {
                    uq0Var.f28835y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23628a) {
            case 0:
                uq0 uq0Var = this.f23630c;
                AnimatorSet[] animatorSetArr = uq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23629b) {
                        uq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.f23630c;
                FrameLayout frameLayout = uq0Var2.h;
                if (animator.equals(uq0Var2.f28835y)) {
                    if (!this.f23629b) {
                        uq0Var2.f28807c.setVisibility(4);
                        FrameLayout frameLayout2 = uq0Var2.f28808c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        uq0Var2.f28811f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    uq0Var2.f28835y = null;
                    return;
                }
                return;
        }
    }
}
