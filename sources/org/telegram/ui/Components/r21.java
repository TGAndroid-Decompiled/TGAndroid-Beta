package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r21 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27507a;
    public final t21 f27508b;

    public r21(t21 t21Var, int i10) {
        this.f27507a = i10;
        this.f27508b = t21Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27507a) {
            case 0:
                ai.n4 n4Var = this.f27508b.f28005f;
                n4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                n4Var.invalidate();
                return;
            default:
                t21 t21Var = this.f27508b;
                t21Var.getClass();
                t21Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.h();
                return;
        }
    }
}
