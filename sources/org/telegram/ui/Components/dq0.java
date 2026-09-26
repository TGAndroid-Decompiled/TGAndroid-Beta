package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class dq0 extends AnimatorListenerAdapter {
    public final int f23716a;
    public final boolean f23717b;
    public final uq0 f23718c;

    public dq0(uq0 uq0Var, boolean z10, int i10) {
        this.f23716a = i10;
        this.f23718c = uq0Var;
        this.f23717b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23716a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f23718c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var = this.f23718c;
                if (animator.equals(uq0Var.f28904y)) {
                    uq0Var.f28904y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23716a) {
            case 0:
                uq0 uq0Var = this.f23718c;
                AnimatorSet[] animatorSetArr = uq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f23717b) {
                        uq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.f23718c;
                FrameLayout frameLayout = uq0Var2.h;
                if (animator.equals(uq0Var2.f28904y)) {
                    if (!this.f23717b) {
                        uq0Var2.f28876c.setVisibility(4);
                        FrameLayout frameLayout2 = uq0Var2.f28877c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        uq0Var2.f28880f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    uq0Var2.f28904y = null;
                    return;
                }
                return;
        }
    }
}
