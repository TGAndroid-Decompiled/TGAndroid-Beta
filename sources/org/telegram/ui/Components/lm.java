package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lm implements ValueAnimator.AnimatorUpdateListener {
    public final int f25919a;
    public final qm f25920b;

    public lm(qm qmVar, int i10) {
        this.f25919a = i10;
        this.f25920b = qmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25919a) {
            case 0:
                qm qmVar = this.f25920b;
                qmVar.getClass();
                qmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                return;
            default:
                qm qmVar2 = this.f25920b;
                qmVar2.getClass();
                qmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                return;
        }
    }
}
