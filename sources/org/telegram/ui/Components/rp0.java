package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f27667a;
    public final boolean f27668b;
    public final iq0 f27669c;

    public rp0(iq0 iq0Var, boolean z10, int i10) {
        this.f27667a = i10;
        this.f27669c = iq0Var;
        this.f27668b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27667a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27669c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                iq0 iq0Var = this.f27669c;
                if (animator.equals(iq0Var.f25015y)) {
                    iq0Var.f25015y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27667a) {
            case 0:
                iq0 iq0Var = this.f27669c;
                AnimatorSet[] animatorSetArr = iq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27668b) {
                        iq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                iq0 iq0Var2 = this.f27669c;
                FrameLayout frameLayout = iq0Var2.h;
                if (animator.equals(iq0Var2.f25015y)) {
                    if (!this.f27668b) {
                        iq0Var2.f24987c.setVisibility(4);
                        FrameLayout frameLayout2 = iq0Var2.f24988c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        iq0Var2.f24991f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    iq0Var2.f25015y = null;
                    return;
                }
                return;
        }
    }
}
