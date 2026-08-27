package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class ap0 extends AnimatorListenerAdapter {

    public final int f26791a;

    public final boolean f26792b;

    public final sp0 f26793c;

    public ap0(sp0 sp0Var, boolean z10, int i10) {
        this.f26791a = i10;
        this.f26793c = sp0Var;
        this.f26792b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f26791a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f26793c.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                sp0 sp0Var = this.f26793c;
                if (animator.equals(sp0Var.f32551y)) {
                    sp0Var.f32551y = null;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26791a) {
            case 0:
                sp0 sp0Var = this.f26793c;
                AnimatorSet[] animatorSetArr = sp0Var.P;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f26792b) {
                        sp0Var.O[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                sp0 sp0Var2 = this.f26793c;
                FrameLayout frameLayout = sp0Var2.h;
                if (animator.equals(sp0Var2.f32551y)) {
                    if (!this.f26792b) {
                        sp0Var2.f32522c.setVisibility(4);
                        FrameLayout frameLayout2 = sp0Var2.Y;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        sp0Var2.f32527f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    sp0Var2.f32551y = null;
                }
                break;
        }
    }
}
