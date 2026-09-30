package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xm implements ValueAnimator.AnimatorUpdateListener {
    public final int f30352a;
    public final xn f30353b;

    public xm(xn xnVar, int i10) {
        this.f30352a = i10;
        this.f30353b = xnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30352a) {
            case 0:
                xn xnVar = this.f30353b;
                xnVar.getClass();
                xnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                xn xnVar2 = this.f30353b;
                xnVar2.getClass();
                xnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
