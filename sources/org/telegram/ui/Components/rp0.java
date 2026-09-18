package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f27670a;
    public final boolean f27671b;
    public final iq0 f27672c;

    public rp0(iq0 iq0Var, boolean z10, int i10) {
        this.f27670a = i10;
        this.f27672c = iq0Var;
        this.f27671b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27670a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27672c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                iq0 iq0Var = this.f27672c;
                if (animator.equals(iq0Var.f25018y)) {
                    iq0Var.f25018y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27670a) {
            case 0:
                iq0 iq0Var = this.f27672c;
                AnimatorSet[] animatorSetArr = iq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27671b) {
                        iq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                iq0 iq0Var2 = this.f27672c;
                FrameLayout frameLayout = iq0Var2.h;
                if (animator.equals(iq0Var2.f25018y)) {
                    if (!this.f27671b) {
                        iq0Var2.f24990c.setVisibility(4);
                        FrameLayout frameLayout2 = iq0Var2.f24991c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        iq0Var2.f24994f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    iq0Var2.f25018y = null;
                    return;
                }
                return;
        }
    }
}
