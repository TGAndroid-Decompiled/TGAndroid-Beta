package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f29822a;
    public final boolean f29823b;
    public final hq0 f29824c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f29822a = i10;
        this.f29824c = hq0Var;
        this.f29823b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29822a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f29824c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f29824c;
                if (animator.equals(hq0Var.f26847y)) {
                    hq0Var.f26847y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29822a) {
            case 0:
                hq0 hq0Var = this.f29824c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f29823b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f29824c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f26847y)) {
                    if (!this.f29823b) {
                        hq0Var2.f26818c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f26819c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f26823f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f26847y = null;
                    return;
                }
                return;
        }
    }
}
