package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class lo0 extends AnimatorListenerAdapter {
    public final int f37209a;
    public final boolean f37210b;
    public final ap0 f37211c;

    public lo0(ap0 ap0Var, boolean z10, int i7) {
        this.f37209a = i7;
        this.f37211c = ap0Var;
        this.f37210b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37209a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f37211c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ap0 ap0Var = this.f37211c;
                if (animator.equals(ap0Var.f33582z1)) {
                    ap0Var.f33582z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37209a) {
            case 0:
                ap0 ap0Var = this.f37211c;
                AnimatorSet[] animatorSetArr = ap0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37210b) {
                        ap0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ap0 ap0Var2 = this.f37211c;
                FrameLayout frameLayout = ap0Var2.f33566r1;
                if (animator.equals(ap0Var2.f33582z1)) {
                    if (!this.f37210b) {
                        ap0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = ap0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        ap0Var2.f33564q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    ap0Var2.f33582z1 = null;
                    return;
                }
                return;
        }
    }
}
