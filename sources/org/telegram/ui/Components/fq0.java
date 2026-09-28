package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class fq0 extends AnimatorListenerAdapter {
    public final int f24335a;
    public final boolean f24336b;
    public final wq0 f24337c;

    public fq0(wq0 wq0Var, boolean z10, int i10) {
        this.f24335a = i10;
        this.f24337c = wq0Var;
        this.f24336b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24335a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f24337c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                wq0 wq0Var = this.f24337c;
                if (animator.equals(wq0Var.f30157y)) {
                    wq0Var.f30157y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24335a) {
            case 0:
                wq0 wq0Var = this.f24337c;
                AnimatorSet[] animatorSetArr = wq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f24336b) {
                        wq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                wq0 wq0Var2 = this.f24337c;
                FrameLayout frameLayout = wq0Var2.h;
                if (animator.equals(wq0Var2.f30157y)) {
                    if (!this.f24336b) {
                        wq0Var2.f30129c.setVisibility(4);
                        FrameLayout frameLayout2 = wq0Var2.f30130c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        wq0Var2.f30133f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    wq0Var2.f30157y = null;
                    return;
                }
                return;
        }
    }
}
