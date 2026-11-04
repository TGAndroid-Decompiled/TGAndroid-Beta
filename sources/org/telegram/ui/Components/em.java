package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class em implements ValueAnimator.AnimatorUpdateListener {
    public final int f33417a;
    public final an f33418b;

    public em(an anVar, int i3) {
        this.f33417a = i3;
        this.f33418b = anVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33417a) {
            case 0:
                an anVar = this.f33418b;
                anVar.getClass();
                anVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                an anVar2 = this.f33418b;
                anVar2.getClass();
                anVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
