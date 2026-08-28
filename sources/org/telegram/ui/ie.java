package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ie implements ValueAnimator.AnimatorUpdateListener {
    public final int f39138a;
    public final qn f39139b;

    public ie(qn qnVar, int i9) {
        this.f39138a = i9;
        this.f39139b = qnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39138a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.f39139b;
                qnVar.G8 = floatValue;
                im imVar = qnVar.T0;
                if (imVar != null) {
                    imVar.invalidate();
                    qnVar.f42077t0.invalidate();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f39139b;
                qnVar2.getClass();
                qnVar2.f41894e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.lc();
                return;
            case 2:
                qn qnVar3 = this.f39139b;
                qnVar3.getClass();
                qnVar3.f41894e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar3.lc();
                return;
            case 3:
                qn qnVar4 = this.f39139b;
                qnVar4.getClass();
                qnVar4.f42163za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar4.o9();
                return;
            default:
                qn qnVar5 = this.f39139b;
                qnVar5.getClass();
                qnVar5.f42163za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar5.o9();
                return;
        }
    }
}
