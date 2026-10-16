package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ox0 extends AnimatorListenerAdapter {
    public final int f27793a;
    public final px0 f27794b;

    public ox0(px0 px0Var, int i10) {
        this.f27793a = i10;
        this.f27794b = px0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27793a) {
            case 0:
                px0 px0Var = this.f27794b;
                px0Var.f28131y = 1.0f;
                px0Var.invalidate();
                px0Var.G = null;
                return;
            case 1:
                px0 px0Var2 = this.f27794b;
                px0Var2.m(((Float) px0Var2.v.getAnimatedValue()).floatValue());
                px0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27794b.F = null;
                return;
        }
    }
}
