package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ko0 extends AnimatorListenerAdapter {
    public final int f36821a;
    public final boolean f36822b;
    public final zo0 f36823c;

    public ko0(zo0 zo0Var, boolean z10, int i7) {
        this.f36821a = i7;
        this.f36823c = zo0Var;
        this.f36822b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36821a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f36823c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                zo0 zo0Var = this.f36823c;
                if (animator.equals(zo0Var.f43006z1)) {
                    zo0Var.f43006z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36821a) {
            case 0:
                zo0 zo0Var = this.f36823c;
                AnimatorSet[] animatorSetArr = zo0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36822b) {
                        zo0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                zo0 zo0Var2 = this.f36823c;
                FrameLayout frameLayout = zo0Var2.f42990r1;
                if (animator.equals(zo0Var2.f43006z1)) {
                    if (!this.f36822b) {
                        zo0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = zo0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        zo0Var2.f42988q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    zo0Var2.f43006z1 = null;
                    return;
                }
                return;
        }
    }
}
