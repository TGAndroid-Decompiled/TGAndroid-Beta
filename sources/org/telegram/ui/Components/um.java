package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f30950a;
    public final tn f30951b;

    public um(tn tnVar, int i10) {
        this.f30950a = i10;
        this.f30951b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30950a) {
            case 0:
                tn tnVar = this.f30951b;
                tnVar.getClass();
                tnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tn tnVar2 = this.f30951b;
                tnVar2.getClass();
                tnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
