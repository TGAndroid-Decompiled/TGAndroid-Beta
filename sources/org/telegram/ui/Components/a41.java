package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24232a;
    public final c41 f24233b;

    public a41(c41 c41Var, int i10) {
        this.f24232a = i10;
        this.f24233b = c41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24232a) {
            case 0:
                ai.o4 o4Var = this.f24233b.f24811f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                return;
            default:
                c41 c41Var = this.f24233b;
                c41Var.getClass();
                c41Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.h();
                return;
        }
    }
}
