package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pm implements ValueAnimator.AnimatorUpdateListener {
    public final int f31710a;
    public final on f31711b;

    public pm(on onVar, int i10) {
        this.f31710a = i10;
        this.f31711b = onVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31710a) {
            case 0:
                on onVar = this.f31711b;
                onVar.getClass();
                onVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                on onVar2 = this.f31711b;
                onVar2.getClass();
                onVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
