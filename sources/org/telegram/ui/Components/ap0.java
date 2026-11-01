package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ap0 extends AnimatorListenerAdapter {
    public final int f24468a;
    public final boolean f24469b;
    public final pp0 f24470c;

    public ap0(pp0 pp0Var, boolean z10, int i10) {
        this.f24468a = i10;
        this.f24470c = pp0Var;
        this.f24469b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24468a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24470c.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                pp0 pp0Var = this.f24470c;
                if (animator.equals(pp0Var.f29500v1)) {
                    pp0Var.f29500v1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24468a) {
            case 0:
                pp0 pp0Var = this.f24470c;
                AnimatorSet[] animatorSetArr = pp0Var.L1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24469b) {
                        pp0Var.K1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                pp0 pp0Var2 = this.f24470c;
                FrameLayout frameLayout = pp0Var2.f29484n1;
                if (animator.equals(pp0Var2.f29500v1)) {
                    if (!this.f24469b) {
                        pp0Var2.f29477j1.setVisibility(4);
                        FrameLayout frameLayout2 = pp0Var2.U1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        pp0Var2.f29482m1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    pp0Var2.f29500v1 = null;
                    return;
                }
                return;
        }
    }
}
