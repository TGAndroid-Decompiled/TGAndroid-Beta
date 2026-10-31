package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class zo0 extends AnimatorListenerAdapter {
    public final int f33137a;
    public final boolean f33138b;
    public final op0 f33139c;

    public zo0(op0 op0Var, boolean z10, int i10) {
        this.f33137a = i10;
        this.f33139c = op0Var;
        this.f33138b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33137a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f33139c.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                op0 op0Var = this.f33139c;
                if (animator.equals(op0Var.f29145v1)) {
                    op0Var.f29145v1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33137a) {
            case 0:
                op0 op0Var = this.f33139c;
                AnimatorSet[] animatorSetArr = op0Var.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33138b) {
                        op0Var.K1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                op0 op0Var2 = this.f33139c;
                FrameLayout frameLayout = op0Var2.f29129n1;
                if (animator.equals(op0Var2.f29145v1)) {
                    if (!this.f33138b) {
                        op0Var2.f29122j1.setVisibility(4);
                        FrameLayout frameLayout2 = op0Var2.U1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        op0Var2.f29127m1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    op0Var2.f29145v1 = null;
                    return;
                }
                return;
        }
    }
}
