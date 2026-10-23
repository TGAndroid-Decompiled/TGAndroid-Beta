package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fn implements ValueAnimator.AnimatorUpdateListener {
    public final int f26284a;
    public final fo f26285b;

    public fn(fo foVar, int i10) {
        this.f26284a = i10;
        this.f26285b = foVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26284a) {
            case 0:
                fo foVar = this.f26285b;
                foVar.getClass();
                foVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fo foVar2 = this.f26285b;
                foVar2.getClass();
                foVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
