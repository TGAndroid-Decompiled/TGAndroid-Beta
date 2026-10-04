package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xm implements ValueAnimator.AnimatorUpdateListener {
    public final int f32900a;
    public final xn f32901b;

    public xm(xn xnVar, int i10) {
        this.f32900a = i10;
        this.f32901b = xnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32900a) {
            case 0:
                xn xnVar = this.f32901b;
                xnVar.getClass();
                xnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xn xnVar2 = this.f32901b;
                xnVar2.getClass();
                xnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
