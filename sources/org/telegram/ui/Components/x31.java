package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32823a;
    public final z31 f32824b;

    public x31(z31 z31Var, int i10) {
        this.f32823a = i10;
        this.f32824b = z31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32823a) {
            case 0:
                ai.o4 o4Var = this.f32824b.f33404f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                return;
            default:
                z31 z31Var = this.f32824b;
                z31Var.getClass();
                z31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z31Var.h();
                return;
        }
    }
}
