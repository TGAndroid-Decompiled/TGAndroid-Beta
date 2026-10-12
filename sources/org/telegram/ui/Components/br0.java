package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class br0 extends AnimatorListenerAdapter {
    public final int f24723a;
    public final boolean f24724b;
    public final sr0 f24725c;

    public br0(sr0 sr0Var, boolean z10, int i10) {
        this.f24723a = i10;
        this.f24725c = sr0Var;
        this.f24724b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24723a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24725c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sr0 sr0Var = this.f24725c;
                if (animator.equals(sr0Var.f30662y)) {
                    sr0Var.f30662y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24723a) {
            case 0:
                sr0 sr0Var = this.f24725c;
                AnimatorSet[] animatorSetArr = sr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24724b) {
                        sr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sr0 sr0Var2 = this.f24725c;
                FrameLayout frameLayout = sr0Var2.h;
                if (animator.equals(sr0Var2.f30662y)) {
                    if (!this.f24724b) {
                        sr0Var2.f30633c.setVisibility(4);
                        FrameLayout frameLayout2 = sr0Var2.f30634c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        sr0Var2.f30638f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    sr0Var2.f30662y = null;
                    return;
                }
                return;
        }
    }
}
