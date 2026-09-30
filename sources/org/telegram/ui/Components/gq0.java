package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class gq0 extends AnimatorListenerAdapter {
    public final int f24660a;
    public final boolean f24661b;
    public final xq0 f24662c;

    public gq0(xq0 xq0Var, boolean z10, int i10) {
        this.f24660a = i10;
        this.f24662c = xq0Var;
        this.f24661b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24660a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24662c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                xq0 xq0Var = this.f24662c;
                if (animator.equals(xq0Var.f30485y)) {
                    xq0Var.f30485y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24660a) {
            case 0:
                xq0 xq0Var = this.f24662c;
                AnimatorSet[] animatorSetArr = xq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24661b) {
                        xq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                xq0 xq0Var2 = this.f24662c;
                FrameLayout frameLayout = xq0Var2.h;
                if (animator.equals(xq0Var2.f30485y)) {
                    if (!this.f24661b) {
                        xq0Var2.f30457c.setVisibility(4);
                        FrameLayout frameLayout2 = xq0Var2.f30458c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        xq0Var2.f30461f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    xq0Var2.f30485y = null;
                    return;
                }
                return;
        }
    }
}
