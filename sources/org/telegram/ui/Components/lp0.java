package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class lp0 extends AnimatorListenerAdapter {
    public final int f30410a;
    public final boolean f30411b;
    public final dq0 f30412c;

    public lp0(dq0 dq0Var, boolean z10, int i10) {
        this.f30410a = i10;
        this.f30412c = dq0Var;
        this.f30411b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30410a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f30412c.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dq0 dq0Var = this.f30412c;
                if (animator.equals(dq0Var.f27859y)) {
                    dq0Var.f27859y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30410a) {
            case 0:
                dq0 dq0Var = this.f30412c;
                AnimatorSet[] animatorSetArr = dq0Var.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30411b) {
                        dq0Var.O[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dq0 dq0Var2 = this.f30412c;
                FrameLayout frameLayout = dq0Var2.h;
                if (animator.equals(dq0Var2.f27859y)) {
                    if (!this.f30411b) {
                        dq0Var2.f27830c.setVisibility(4);
                        FrameLayout frameLayout2 = dq0Var2.Y;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        dq0Var2.f27835f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    dq0Var2.f27859y = null;
                    return;
                }
                return;
        }
    }
}
