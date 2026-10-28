package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f34562a;
    public final boolean f34563b;
    public final nr0 f34564c;

    public wq0(nr0 nr0Var, boolean z10, int i10) {
        this.f34562a = i10;
        this.f34564c = nr0Var;
        this.f34563b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f34562a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f34564c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                nr0 nr0Var = this.f34564c;
                if (animator.equals(nr0Var.E)) {
                    nr0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34562a) {
            case 0:
                nr0 nr0Var = this.f34564c;
                AnimatorSet[] animatorSetArr = nr0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34563b) {
                        nr0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f34564c;
                FrameLayout frameLayout = nr0Var2.h;
                if (animator.equals(nr0Var2.E)) {
                    if (!this.f34563b) {
                        nr0Var2.f31033c.setVisibility(4);
                        FrameLayout frameLayout2 = nr0Var2.f31035d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        nr0Var2.f31037f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    nr0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
