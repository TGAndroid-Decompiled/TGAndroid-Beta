package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f27412a;
    public final boolean f27413b;
    public final hq0 f27414c;

    public qp0(hq0 hq0Var, boolean z10, int i10) {
        this.f27412a = i10;
        this.f27414c = hq0Var;
        this.f27413b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27412a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27414c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var = this.f27414c;
                if (animator.equals(hq0Var.f24785y)) {
                    hq0Var.f24785y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27412a) {
            case 0:
                hq0 hq0Var = this.f27414c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27413b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f27414c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.f24785y)) {
                    if (!this.f27413b) {
                        hq0Var2.f24757c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.f24758c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f24761f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.f24785y = null;
                    return;
                }
                return;
        }
    }
}
