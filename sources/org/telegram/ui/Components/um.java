package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f30922a;
    public final tn f30923b;

    public um(tn tnVar, int i10) {
        this.f30922a = i10;
        this.f30923b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30922a) {
            case 0:
                tn tnVar = this.f30923b;
                tnVar.getClass();
                tnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tn tnVar2 = this.f30923b;
                tnVar2.getClass();
                tnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
