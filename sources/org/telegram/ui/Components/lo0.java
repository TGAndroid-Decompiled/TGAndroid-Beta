package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class lo0 extends AnimatorListenerAdapter {
    public final int f37247a;
    public final boolean f37248b;
    public final ap0 f37249c;

    public lo0(ap0 ap0Var, boolean z10, int i7) {
        this.f37247a = i7;
        this.f37249c = ap0Var;
        this.f37248b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37247a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f37249c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ap0 ap0Var = this.f37249c;
                if (animator.equals(ap0Var.f33585z1)) {
                    ap0Var.f33585z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37247a) {
            case 0:
                ap0 ap0Var = this.f37249c;
                AnimatorSet[] animatorSetArr = ap0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37248b) {
                        ap0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ap0 ap0Var2 = this.f37249c;
                FrameLayout frameLayout = ap0Var2.f33569r1;
                if (animator.equals(ap0Var2.f33585z1)) {
                    if (!this.f37248b) {
                        ap0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = ap0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        ap0Var2.f33567q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    ap0Var2.f33585z1 = null;
                    return;
                }
                return;
        }
    }
}
