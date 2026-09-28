package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class fq0 extends AnimatorListenerAdapter {
    public final int f24336a;
    public final boolean f24337b;
    public final wq0 f24338c;

    public fq0(wq0 wq0Var, boolean z10, int i10) {
        this.f24336a = i10;
        this.f24338c = wq0Var;
        this.f24337b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24336a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24338c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                wq0 wq0Var = this.f24338c;
                if (animator.equals(wq0Var.f30158y)) {
                    wq0Var.f30158y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24336a) {
            case 0:
                wq0 wq0Var = this.f24338c;
                AnimatorSet[] animatorSetArr = wq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24337b) {
                        wq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                wq0 wq0Var2 = this.f24338c;
                FrameLayout frameLayout = wq0Var2.h;
                if (animator.equals(wq0Var2.f30158y)) {
                    if (!this.f24337b) {
                        wq0Var2.f30130c.setVisibility(4);
                        FrameLayout frameLayout2 = wq0Var2.f30131c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        wq0Var2.f30134f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    wq0Var2.f30158y = null;
                    return;
                }
                return;
        }
    }
}
