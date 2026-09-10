package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class aq0 extends AnimatorListenerAdapter {
    public final int f21561a;
    public final boolean f21562b;
    public final sq0 f21563c;

    public aq0(sq0 sq0Var, boolean z10, int i10) {
        this.f21561a = i10;
        this.f21563c = sq0Var;
        this.f21562b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21561a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f21563c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sq0 sq0Var = this.f21563c;
                if (animator.equals(sq0Var.f27197y)) {
                    sq0Var.f27197y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21561a) {
            case 0:
                sq0 sq0Var = this.f21563c;
                AnimatorSet[] animatorSetArr = sq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f21562b) {
                        sq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                sq0 sq0Var2 = this.f21563c;
                FrameLayout frameLayout = sq0Var2.h;
                if (animator.equals(sq0Var2.f27197y)) {
                    if (!this.f21562b) {
                        sq0Var2.f27169c.setVisibility(4);
                        FrameLayout frameLayout2 = sq0Var2.f27170c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        sq0Var2.f27173f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    sq0Var2.f27197y = null;
                    return;
                }
                return;
        }
    }
}
