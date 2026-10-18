package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mq0 extends AnimatorListenerAdapter {
    public final int f28581a;
    public final boolean f28582b;
    public final dr0 f28583c;

    public mq0(dr0 dr0Var, boolean z10, int i10) {
        this.f28581a = i10;
        this.f28583c = dr0Var;
        this.f28582b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28581a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28583c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dr0 dr0Var = this.f28583c;
                if (animator.equals(dr0Var.f25690y)) {
                    dr0Var.f25690y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28581a) {
            case 0:
                dr0 dr0Var = this.f28583c;
                AnimatorSet[] animatorSetArr = dr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28582b) {
                        dr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dr0 dr0Var2 = this.f28583c;
                FrameLayout frameLayout = dr0Var2.h;
                if (animator.equals(dr0Var2.f25690y)) {
                    if (!this.f28582b) {
                        dr0Var2.f25662c.setVisibility(4);
                        FrameLayout frameLayout2 = dr0Var2.f25663c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        dr0Var2.f25666f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    dr0Var2.f25690y = null;
                    return;
                }
                return;
        }
    }
}
