package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class yn0 extends AnimatorListenerAdapter {
    public final int f40779a;
    public final boolean f40780b;
    public final no0 f40781c;

    public yn0(no0 no0Var, boolean z9, int i7) {
        this.f40779a = i7;
        this.f40781c = no0Var;
        this.f40780b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40779a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f40781c.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                no0 no0Var = this.f40781c;
                if (animator.equals(no0Var.f36461v1)) {
                    no0Var.f36461v1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40779a) {
            case 0:
                no0 no0Var = this.f40781c;
                AnimatorSet[] animatorSetArr = no0Var.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40780b) {
                        no0Var.K1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                no0 no0Var2 = this.f40781c;
                FrameLayout frameLayout = no0Var2.n1;
                if (animator.equals(no0Var2.f36461v1)) {
                    if (!this.f40780b) {
                        no0Var2.f36439j1.setVisibility(4);
                        FrameLayout frameLayout2 = no0Var2.U1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        no0Var2.f36444m1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    no0Var2.f36461v1 = null;
                    return;
                }
                return;
        }
    }
}
