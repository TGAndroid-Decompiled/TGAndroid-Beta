package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ao0 extends AnimatorListenerAdapter {
    public final int f33030a;
    public final boolean f33031b;
    public final po0 f33032c;

    public ao0(po0 po0Var, boolean z10, int i7) {
        this.f33030a = i7;
        this.f33032c = po0Var;
        this.f33031b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33030a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f33032c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                po0 po0Var = this.f33032c;
                if (animator.equals(po0Var.f38376z1)) {
                    po0Var.f38376z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33030a) {
            case 0:
                po0 po0Var = this.f33032c;
                AnimatorSet[] animatorSetArr = po0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33031b) {
                        po0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                po0 po0Var2 = this.f33032c;
                FrameLayout frameLayout = po0Var2.f38360r1;
                if (animator.equals(po0Var2.f38376z1)) {
                    if (!this.f33031b) {
                        po0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = po0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        po0Var2.f38358q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    po0Var2.f38376z1 = null;
                    return;
                }
                return;
        }
    }
}
