package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f27421a;
    public final boolean f27422b;
    public final hq0 f27423c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f27421a = i10;
        this.f27423c = hq0Var;
        this.f27422b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27421a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27423c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f27423c;
                if (animator.equals(hq0Var.f24804y)) {
                    hq0Var.f24804y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27421a) {
            case 0:
                hq0 hq0Var = this.f27423c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27422b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f27423c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f24804y)) {
                    if (!this.f27422b) {
                        hq0Var2.f24776c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f24777c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f24780f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f24804y = null;
                    return;
                }
                return;
        }
    }
}
