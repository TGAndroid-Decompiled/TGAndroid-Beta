package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class up0 extends AnimatorListenerAdapter {
    public final int f29274a;
    public final boolean f29275b;
    public final lq0 f29276c;

    public up0(lq0 lq0Var, boolean z4, int i10) {
        this.f29274a = i10;
        this.f29276c = lq0Var;
        this.f29275b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29274a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29276c.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                lq0 lq0Var = this.f29276c;
                if (animator.equals(lq0Var.f26863y)) {
                    lq0Var.f26863y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29274a) {
            case 0:
                lq0 lq0Var = this.f29276c;
                AnimatorSet[] animatorSetArr = lq0Var.Q;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29275b) {
                        lq0Var.P[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                lq0 lq0Var2 = this.f29276c;
                FrameLayout frameLayout = lq0Var2.h;
                if (animator.equals(lq0Var2.f26863y)) {
                    if (!this.f29275b) {
                        lq0Var2.f26835c.setVisibility(4);
                        FrameLayout frameLayout2 = lq0Var2.Z;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        lq0Var2.f26839f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    lq0Var2.f26863y = null;
                    return;
                }
                return;
        }
    }
}
