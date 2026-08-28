package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yv0 extends AnimatorListenerAdapter {
    public final int f35084a;
    public final zv0 f35085b;

    public yv0(zv0 zv0Var, int i9) {
        this.f35084a = i9;
        this.f35085b = zv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35084a) {
            case 0:
                zv0 zv0Var = this.f35085b;
                zv0Var.f35382y = 1.0f;
                zv0Var.invalidate();
                zv0Var.C = null;
                return;
            case 1:
                zv0 zv0Var2 = this.f35085b;
                zv0Var2.m(((Float) zv0Var2.v.getAnimatedValue()).floatValue());
                zv0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f35085b.B = null;
                return;
        }
    }
}
