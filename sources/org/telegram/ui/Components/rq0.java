package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class rq0 extends AnimatorListenerAdapter {
    public final int f30244a;
    public final boolean f30245b;
    public final ir0 f30246c;

    public rq0(ir0 ir0Var, boolean z10, int i10) {
        this.f30244a = i10;
        this.f30246c = ir0Var;
        this.f30245b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30244a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f30246c.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ir0 ir0Var = this.f30246c;
                if (animator.equals(ir0Var.E)) {
                    ir0Var.E = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30244a) {
            case 0:
                ir0 ir0Var = this.f30246c;
                AnimatorSet[] animatorSetArr = ir0Var.U;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f30245b) {
                        ir0Var.T[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ir0 ir0Var2 = this.f30246c;
                FrameLayout frameLayout = ir0Var2.h;
                if (animator.equals(ir0Var2.E)) {
                    if (!this.f30245b) {
                        ir0Var2.f27411c.setVisibility(4);
                        FrameLayout frameLayout2 = ir0Var2.f27414d0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        ir0Var2.f27416f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    ir0Var2.E = null;
                    return;
                }
                return;
        }
    }
}
