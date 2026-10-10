package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f32728a;
    public final boolean f32729b;
    public final nr0 f32730c;

    public wq0(nr0 nr0Var, boolean z10, int i10) {
        this.f32728a = i10;
        this.f32730c = nr0Var;
        this.f32729b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32728a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f32730c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                nr0 nr0Var = this.f32730c;
                if (animator.equals(nr0Var.f29222y)) {
                    nr0Var.f29222y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32728a) {
            case 0:
                nr0 nr0Var = this.f32730c;
                AnimatorSet[] animatorSetArr = nr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32729b) {
                        nr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f32730c;
                FrameLayout frameLayout = nr0Var2.h;
                if (animator.equals(nr0Var2.f29222y)) {
                    if (!this.f32729b) {
                        nr0Var2.f29193c.setVisibility(4);
                        FrameLayout frameLayout2 = nr0Var2.f29194c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        nr0Var2.f29198f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    nr0Var2.f29222y = null;
                    return;
                }
                return;
        }
    }
}
