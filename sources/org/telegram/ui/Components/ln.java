package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ln implements ValueAnimator.AnimatorUpdateListener {
    public final int f28505a;
    public final lo f28506b;

    public ln(lo loVar, int i10) {
        this.f28505a = i10;
        this.f28506b = loVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28505a) {
            case 0:
                lo loVar = this.f28506b;
                loVar.getClass();
                loVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lo loVar2 = this.f28506b;
                loVar2.getClass();
                loVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
