package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class um implements ValueAnimator.AnimatorUpdateListener {
    public final int f30923a;
    public final tn f30924b;

    public um(tn tnVar, int i10) {
        this.f30923a = i10;
        this.f30924b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30923a) {
            case 0:
                tn tnVar = this.f30924b;
                tnVar.getClass();
                tnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tn tnVar2 = this.f30924b;
                tnVar2.getClass();
                tnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
