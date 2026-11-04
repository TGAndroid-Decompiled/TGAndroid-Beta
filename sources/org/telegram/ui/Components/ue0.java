package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ue0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38731a;
    public final xe0 f38732b;

    public ue0(xe0 xe0Var, int i3) {
        this.f38731a = i3;
        this.f38732b = xe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38731a) {
            case 0:
                xe0 xe0Var = this.f38732b;
                xe0Var.getClass();
                xe0Var.f40329b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var.c(true);
                return;
            default:
                xe0 xe0Var2 = this.f38732b;
                xe0Var2.getClass();
                xe0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var2.c(true);
                return;
        }
    }
}
