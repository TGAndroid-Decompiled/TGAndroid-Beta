package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32245a;
    public final tg0 f32246b;

    public rg0(tg0 tg0Var, int i10) {
        this.f32245a = i10;
        this.f32246b = tg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32245a) {
            case 0:
                tg0 tg0Var = this.f32246b;
                tg0Var.getClass();
                tg0Var.f32996y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var.invalidate();
                return;
            default:
                tg0 tg0Var2 = this.f32246b;
                tg0Var2.getClass();
                tg0Var2.f32996y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg0Var2.invalidate();
                return;
        }
    }
}
