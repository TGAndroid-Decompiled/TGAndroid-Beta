package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f39180a;
    public final yn f39181b;

    public oe(yn ynVar, int i10) {
        this.f39180a = i10;
        this.f39181b = ynVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39180a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yn ynVar = this.f39181b;
                ynVar.I8 = floatValue;
                qm qmVar = ynVar.V0;
                if (qmVar != null) {
                    qmVar.invalidate();
                    ynVar.f43526v0.invalidate();
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f39181b;
                ynVar2.getClass();
                ynVar2.f43343g3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar2.kc();
                return;
            case 2:
                yn ynVar3 = this.f39181b;
                ynVar3.getClass();
                ynVar3.f43343g3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar3.kc();
                return;
            case 3:
                yn ynVar4 = this.f39181b;
                ynVar4.getClass();
                ynVar4.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar4.o9();
                return;
            default:
                yn ynVar5 = this.f39181b;
                ynVar5.getClass();
                ynVar5.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar5.o9();
                return;
        }
    }
}
