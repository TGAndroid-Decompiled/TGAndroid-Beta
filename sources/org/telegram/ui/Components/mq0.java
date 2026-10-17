package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mq0 extends AnimatorListenerAdapter {
    public final int f28574a;
    public final boolean f28575b;
    public final dr0 f28576c;

    public mq0(dr0 dr0Var, boolean z10, int i10) {
        this.f28574a = i10;
        this.f28576c = dr0Var;
        this.f28575b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28574a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28576c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dr0 dr0Var = this.f28576c;
                if (animator.equals(dr0Var.f25683y)) {
                    dr0Var.f25683y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28574a) {
            case 0:
                dr0 dr0Var = this.f28576c;
                AnimatorSet[] animatorSetArr = dr0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28575b) {
                        dr0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                dr0 dr0Var2 = this.f28576c;
                FrameLayout frameLayout = dr0Var2.h;
                if (animator.equals(dr0Var2.f25683y)) {
                    if (!this.f28575b) {
                        dr0Var2.f25655c.setVisibility(4);
                        FrameLayout frameLayout2 = dr0Var2.f25656c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        dr0Var2.f25659f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    dr0Var2.f25683y = null;
                    return;
                }
                return;
        }
    }
}
