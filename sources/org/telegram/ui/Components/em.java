package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class em implements ValueAnimator.AnimatorUpdateListener {
    public final int f33294a;
    public final an f33295b;

    public em(an anVar, int i7) {
        this.f33294a = i7;
        this.f33295b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33294a) {
            case 0:
                an anVar = this.f33295b;
                anVar.getClass();
                anVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                an anVar2 = this.f33295b;
                anVar2.getClass();
                anVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
