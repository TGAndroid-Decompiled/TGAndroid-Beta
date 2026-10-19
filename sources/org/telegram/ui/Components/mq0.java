package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mq0 extends AnimatorListenerAdapter {
    public final int f28587a;
    public final boolean f28588b;
    public final er0 f28589c;

    public mq0(er0 er0Var, boolean z10, int i10) {
        this.f28587a = i10;
        this.f28589c = er0Var;
        this.f28588b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28587a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28589c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                er0 er0Var = this.f28589c;
                if (animator.equals(er0Var.E)) {
                    er0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28587a) {
            case 0:
                er0 er0Var = this.f28589c;
                AnimatorSet[] animatorSetArr = er0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28588b) {
                        er0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                er0 er0Var2 = this.f28589c;
                FrameLayout frameLayout = er0Var2.h;
                if (animator.equals(er0Var2.E)) {
                    if (!this.f28588b) {
                        er0Var2.f25979c.setVisibility(4);
                        FrameLayout frameLayout2 = er0Var2.f25981d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        er0Var2.f25983f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    er0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
