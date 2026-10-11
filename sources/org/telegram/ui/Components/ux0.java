package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ux0 extends AnimatorListenerAdapter {
    public final int f31608a;
    public final vx0 f31609b;

    public ux0(vx0 vx0Var, int i10) {
        this.f31608a = i10;
        this.f31609b = vx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31608a) {
            case 0:
                vx0 vx0Var = this.f31609b;
                vx0Var.f32509y = 1.0f;
                vx0Var.invalidate();
                vx0Var.G = null;
                return;
            case 1:
                vx0 vx0Var2 = this.f31609b;
                vx0Var2.m(((Float) vx0Var2.v.getAnimatedValue()).floatValue());
                vx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f31609b.F = null;
                return;
        }
    }
}
