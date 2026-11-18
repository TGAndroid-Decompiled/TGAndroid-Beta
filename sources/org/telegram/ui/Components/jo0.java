package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class jo0 extends AnimatorListenerAdapter {
    public final int f36502a;
    public final boolean f36503b;
    public final yo0 f36504c;

    public jo0(yo0 yo0Var, boolean z10, int i7) {
        this.f36502a = i7;
        this.f36504c = yo0Var;
        this.f36503b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36502a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f36504c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                yo0 yo0Var = this.f36504c;
                if (animator.equals(yo0Var.f42589z1)) {
                    yo0Var.f42589z1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36502a) {
            case 0:
                yo0 yo0Var = this.f36504c;
                AnimatorSet[] animatorSetArr = yo0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36503b) {
                        yo0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                yo0 yo0Var2 = this.f36504c;
                FrameLayout frameLayout = yo0Var2.f42573r1;
                if (animator.equals(yo0Var2.f42589z1)) {
                    if (!this.f36503b) {
                        yo0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = yo0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        yo0Var2.f42571q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    yo0Var2.f42589z1 = null;
                    return;
                }
                return;
        }
    }
}
