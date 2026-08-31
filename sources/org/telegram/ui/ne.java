package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f39416a;
    public final xn f39417b;

    public ne(xn xnVar, int i10) {
        this.f39416a = i10;
        this.f39417b = xnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39416a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xn xnVar = this.f39417b;
                xnVar.H8 = floatValue;
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    xnVar.f43362u0.invalidate();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f39417b;
                xnVar2.getClass();
                xnVar2.f43182f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.lc();
                return;
            case 2:
                xn xnVar3 = this.f39417b;
                xnVar3.getClass();
                xnVar3.f43182f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar3.lc();
                return;
            case 3:
                xn xnVar4 = this.f39417b;
                xnVar4.getClass();
                xnVar4.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar4.o9();
                return;
            default:
                xn xnVar5 = this.f39417b;
                xnVar5.getClass();
                xnVar5.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar5.o9();
                return;
        }
    }
}
