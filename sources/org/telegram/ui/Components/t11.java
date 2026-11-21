package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39759a;
    public final w11 f39760b;

    public t11(w11 w11Var, int i7) {
        this.f39759a = i7;
        this.f39760b = w11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39759a) {
            case 0:
                fi.u2 u2Var = this.f39760b.f41627f;
                u2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.invalidate();
                return;
            default:
                w11 w11Var = this.f39760b;
                w11Var.getClass();
                w11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w11Var.h();
                return;
        }
    }
}
