package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ie implements ValueAnimator.AnimatorUpdateListener {

    public final int f39066a;

    public final rn f39067b;

    public ie(rn rnVar, int i10) {
        this.f39066a = i10;
        this.f39067b = rnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39066a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar = this.f39067b;
                rnVar.G8 = fFloatValue;
                jm jmVar = rnVar.T0;
                if (jmVar != null) {
                    jmVar.invalidate();
                    rnVar.f42213t0.invalidate();
                }
                break;
            case 1:
                rn rnVar2 = this.f39067b;
                rnVar2.getClass();
                rnVar2.f42030e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.lc();
                break;
            case 2:
                rn rnVar3 = this.f39067b;
                rnVar3.getClass();
                rnVar3.f42030e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar3.lc();
                break;
            case 3:
                rn rnVar4 = this.f39067b;
                rnVar4.getClass();
                rnVar4.f42300za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar4.o9();
                break;
            default:
                rn rnVar5 = this.f39067b;
                rnVar5.getClass();
                rnVar5.f42300za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar5.o9();
                break;
        }
    }
}
