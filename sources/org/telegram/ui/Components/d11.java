package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32748a;
    public final g11 f32749b;

    public d11(g11 g11Var, int i7) {
        this.f32748a = i7;
        this.f32749b = g11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32748a) {
            case 0:
                di.b3 b3Var = this.f32749b.f33726f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                g11 g11Var = this.f32749b;
                g11Var.getClass();
                g11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.h();
                return;
        }
    }
}
