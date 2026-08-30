package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ne implements ValueAnimator.AnimatorUpdateListener {
    public final int f36610a;
    public final xn f36611b;

    public ne(xn xnVar, int i10) {
        this.f36610a = i10;
        this.f36611b = xnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36610a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xn xnVar = this.f36611b;
                xnVar.H8 = floatValue;
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    xnVar.f40193u0.invalidate();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f36611b;
                xnVar2.getClass();
                xnVar2.f40013f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.lc();
                return;
            case 2:
                xn xnVar3 = this.f36611b;
                xnVar3.getClass();
                xnVar3.f40013f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar3.lc();
                return;
            case 3:
                xn xnVar4 = this.f36611b;
                xnVar4.getClass();
                xnVar4.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar4.o9();
                return;
            default:
                xn xnVar5 = this.f36611b;
                xnVar5.getClass();
                xnVar5.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar5.o9();
                return;
        }
    }
}
