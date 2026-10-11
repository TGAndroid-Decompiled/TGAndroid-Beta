package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ln implements ValueAnimator.AnimatorUpdateListener {
    public final int f28368a;
    public final lo f28369b;

    public ln(lo loVar, int i10) {
        this.f28368a = i10;
        this.f28369b = loVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28368a) {
            case 0:
                lo loVar = this.f28369b;
                loVar.getClass();
                loVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                lo loVar2 = this.f28369b;
                loVar2.getClass();
                loVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
