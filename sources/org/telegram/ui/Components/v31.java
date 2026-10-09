package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class v31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31687a;
    public final x31 f31688b;

    public v31(x31 x31Var, int i10) {
        this.f31687a = i10;
        this.f31688b = x31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31687a) {
            case 0:
                ai.o4 o4Var = this.f31688b.f32737f;
                o4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                o4Var.invalidate();
                return;
            default:
                x31 x31Var = this.f31688b;
                x31Var.getClass();
                x31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.h();
                return;
        }
    }
}
