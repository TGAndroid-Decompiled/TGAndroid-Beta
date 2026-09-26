package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lm implements ValueAnimator.AnimatorUpdateListener {
    public final int f26134a;
    public final qm f26135b;

    public lm(qm qmVar, int i10) {
        this.f26134a = i10;
        this.f26135b = qmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26134a) {
            case 0:
                qm qmVar = this.f26135b;
                qmVar.getClass();
                qmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                return;
            default:
                qm qmVar2 = this.f26135b;
                qmVar2.getClass();
                qmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                return;
        }
    }
}
