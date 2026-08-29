package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ge implements ValueAnimator.AnimatorUpdateListener {
    public final int f38567a;
    public final tn f38568b;

    public ge(tn tnVar, int i10) {
        this.f38567a = i10;
        this.f38568b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38567a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar = this.f38568b;
                tnVar.G8 = floatValue;
                km kmVar = tnVar.T0;
                if (kmVar != null) {
                    kmVar.invalidate();
                    tnVar.f42973t0.invalidate();
                    return;
                }
                return;
            case 1:
                tn tnVar2 = this.f38568b;
                tnVar2.getClass();
                tnVar2.f42791e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.lc();
                return;
            case 2:
                tn tnVar3 = this.f38568b;
                tnVar3.getClass();
                tnVar3.f42791e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar3.lc();
                return;
            case 3:
                tn tnVar4 = this.f38568b;
                tnVar4.getClass();
                tnVar4.f43060za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar4.o9();
                return;
            default:
                tn tnVar5 = this.f38568b;
                tnVar5.getClass();
                tnVar5.f43060za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar5.o9();
                return;
        }
    }
}
