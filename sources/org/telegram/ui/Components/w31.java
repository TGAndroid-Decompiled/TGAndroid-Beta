package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32626a;
    public final y31 f32627b;

    public w31(y31 y31Var, int i10) {
        this.f32626a = i10;
        this.f32627b = y31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32626a) {
            case 0:
                ai.o4 o4Var = this.f32627b.f33133f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                return;
            default:
                y31 y31Var = this.f32627b;
                y31Var.getClass();
                y31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y31Var.h();
                return;
        }
    }
}
