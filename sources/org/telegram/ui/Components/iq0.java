package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class iq0 extends AnimatorListenerAdapter {
    public final int f27466a;
    public final boolean f27467b;
    public final zq0 f27468c;

    public iq0(zq0 zq0Var, boolean z10, int i10) {
        this.f27466a = i10;
        this.f27468c = zq0Var;
        this.f27467b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f27466a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f27468c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                zq0 zq0Var = this.f27468c;
                if (animator.equals(zq0Var.f33634y)) {
                    zq0Var.f33634y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27466a) {
            case 0:
                zq0 zq0Var = this.f27468c;
                AnimatorSet[] animatorSetArr = zq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f27467b) {
                        zq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                zq0 zq0Var2 = this.f27468c;
                FrameLayout frameLayout = zq0Var2.h;
                if (animator.equals(zq0Var2.f33634y)) {
                    if (!this.f27467b) {
                        zq0Var2.f33605c.setVisibility(4);
                        FrameLayout frameLayout2 = zq0Var2.f33606c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        zq0Var2.f33610f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    zq0Var2.f33634y = null;
                    return;
                }
                return;
        }
    }
}
