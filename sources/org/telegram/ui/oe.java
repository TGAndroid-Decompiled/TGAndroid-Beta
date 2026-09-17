package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f39226a;
    public final co f39227b;

    public oe(co coVar, int i10) {
        this.f39226a = i10;
        this.f39227b = coVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39226a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                co coVar = this.f39227b;
                coVar.K8 = floatValue;
                um umVar = coVar.X0;
                if (umVar != null) {
                    umVar.invalidate();
                    coVar.f35474x0.invalidate();
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f39227b;
                coVar2.getClass();
                coVar2.f35289i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.lc();
                return;
            case 2:
                co coVar3 = this.f39227b;
                coVar3.getClass();
                coVar3.f35289i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar3.lc();
                return;
            case 3:
                co coVar4 = this.f39227b;
                coVar4.getClass();
                coVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar4.o9();
                return;
            default:
                co coVar5 = this.f39227b;
                coVar5.getClass();
                coVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar5.o9();
                return;
        }
    }
}
