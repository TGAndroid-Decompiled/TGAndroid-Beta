package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cx0 extends AnimatorListenerAdapter {
    public final int f23442a;
    public final dx0 f23443b;

    public cx0(dx0 dx0Var, int i10) {
        this.f23442a = i10;
        this.f23443b = dx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23442a) {
            case 0:
                dx0 dx0Var = this.f23443b;
                dx0Var.f23751y = 1.0f;
                dx0Var.invalidate();
                dx0Var.G = null;
                return;
            case 1:
                dx0 dx0Var2 = this.f23443b;
                dx0Var2.m(((Float) dx0Var2.v.getAnimatedValue()).floatValue());
                dx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f23443b.F = null;
                return;
        }
    }
}
