package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qe implements ValueAnimator.AnimatorUpdateListener {
    public final int f36722a;
    public final xn f36723b;

    public qe(xn xnVar, int i10) {
        this.f36722a = i10;
        this.f36723b = xnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36722a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xn xnVar = this.f36723b;
                xnVar.K8 = floatValue;
                qm qmVar = xnVar.X0;
                if (qmVar != null) {
                    qmVar.invalidate();
                    xnVar.f39977x0.invalidate();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f36723b;
                xnVar2.getClass();
                xnVar2.f39792i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.lc();
                return;
            case 2:
                xn xnVar3 = this.f36723b;
                xnVar3.getClass();
                xnVar3.f39792i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar3.lc();
                return;
            case 3:
                xn xnVar4 = this.f36723b;
                xnVar4.getClass();
                xnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar4.o9();
                return;
            default:
                xn xnVar5 = this.f36723b;
                xnVar5.getClass();
                xnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar5.o9();
                return;
        }
    }
}
