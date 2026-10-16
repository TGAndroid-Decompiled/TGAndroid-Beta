package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class rq0 extends AnimatorListenerAdapter {
    public final int f28625a;
    public final boolean f28626b;
    public final ir0 f28627c;

    public rq0(ir0 ir0Var, boolean z10, int i10) {
        this.f28625a = i10;
        this.f28627c = ir0Var;
        this.f28626b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28625a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.f28627c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ir0 ir0Var = this.f28627c;
                if (animator.equals(ir0Var.f25771y)) {
                    ir0Var.f25771y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28625a) {
            case 0:
                ir0 ir0Var = this.f28627c;
                AnimatorSet[] animatorSetArr = ir0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f28626b) {
                        ir0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                ir0 ir0Var2 = this.f28627c;
                FrameLayout frameLayout = ir0Var2.h;
                if (animator.equals(ir0Var2.f25771y)) {
                    if (!this.f28626b) {
                        ir0Var2.f25743c.setVisibility(4);
                        FrameLayout frameLayout2 = ir0Var2.f25744c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        ir0Var2.f25747f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    ir0Var2.f25771y = null;
                    return;
                }
                return;
        }
    }
}
