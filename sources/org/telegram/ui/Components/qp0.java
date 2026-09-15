package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f27415a;
    public final boolean f27416b;
    public final hq0 f27417c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f27415a = i10;
        this.f27417c = hq0Var;
        this.f27416b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27415a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27417c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f27417c;
                if (animator.equals(hq0Var.f24779y)) {
                    hq0Var.f24779y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27415a) {
            case 0:
                hq0 hq0Var = this.f27417c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27416b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f27417c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f24779y)) {
                    if (!this.f27416b) {
                        hq0Var2.f24751c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f24752c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f24755f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f24779y = null;
                    return;
                }
                return;
        }
    }
}
