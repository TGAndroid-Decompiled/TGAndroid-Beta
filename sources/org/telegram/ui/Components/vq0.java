package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class vq0 extends AnimatorListenerAdapter {
    public final int f32424a;
    public final boolean f32425b;
    public final mr0 f32426c;

    public vq0(mr0 mr0Var, boolean z10, int i10) {
        this.f32424a = i10;
        this.f32426c = mr0Var;
        this.f32425b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32424a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f32426c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mr0 mr0Var = this.f32426c;
                if (animator.equals(mr0Var.f28925y)) {
                    mr0Var.f28925y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32424a) {
            case 0:
                mr0 mr0Var = this.f32426c;
                AnimatorSet[] animatorSetArr = mr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32425b) {
                        mr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.f32426c;
                FrameLayout frameLayout = mr0Var2.h;
                if (animator.equals(mr0Var2.f28925y)) {
                    if (!this.f32425b) {
                        mr0Var2.f28896c.setVisibility(4);
                        FrameLayout frameLayout2 = mr0Var2.f28897c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        mr0Var2.f28901f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    mr0Var2.f28925y = null;
                    return;
                }
                return;
        }
    }
}
