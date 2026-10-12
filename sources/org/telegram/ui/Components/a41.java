package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24233a;
    public final c41 f24234b;

    public a41(c41 c41Var, int i10) {
        this.f24233a = i10;
        this.f24234b = c41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24233a) {
            case 0:
                ai.o4 o4Var = this.f24234b.f24806f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                return;
            default:
                c41 c41Var = this.f24234b;
                c41Var.getClass();
                c41Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.h();
                return;
        }
    }
}
