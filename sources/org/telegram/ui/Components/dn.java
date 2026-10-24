package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dn implements ValueAnimator.AnimatorUpdateListener {
    public final int f25794a;
    public final co f25795b;

    public dn(co coVar, int i10) {
        this.f25794a = i10;
        this.f25795b = coVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25794a) {
            case 0:
                co coVar = this.f25795b;
                coVar.getClass();
                coVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                co coVar2 = this.f25795b;
                coVar2.getClass();
                coVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
