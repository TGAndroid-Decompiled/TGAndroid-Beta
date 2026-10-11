package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class xq0 extends AnimatorListenerAdapter {
    public final int f33007a;
    public final boolean f33008b;
    public final or0 f33009c;

    public xq0(or0 or0Var, boolean z10, int i10) {
        this.f33007a = i10;
        this.f33009c = or0Var;
        this.f33008b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33007a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f33009c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                or0 or0Var = this.f33009c;
                if (animator.equals(or0Var.f29507y)) {
                    or0Var.f29507y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33007a) {
            case 0:
                or0 or0Var = this.f33009c;
                AnimatorSet[] animatorSetArr = or0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33008b) {
                        or0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                or0 or0Var2 = this.f33009c;
                FrameLayout frameLayout = or0Var2.h;
                if (animator.equals(or0Var2.f29507y)) {
                    if (!this.f33008b) {
                        or0Var2.f29478c.setVisibility(4);
                        FrameLayout frameLayout2 = or0Var2.f29479c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        or0Var2.f29483f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    or0Var2.f29507y = null;
                    return;
                }
                return;
        }
    }
}
