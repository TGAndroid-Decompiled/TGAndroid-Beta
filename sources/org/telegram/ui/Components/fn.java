package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fn implements ValueAnimator.AnimatorUpdateListener {
    public final int f26283a;
    public final fo f26284b;

    public fn(fo foVar, int i10) {
        this.f26283a = i10;
        this.f26284b = foVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26283a) {
            case 0:
                fo foVar = this.f26284b;
                foVar.getClass();
                foVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fo foVar2 = this.f26284b;
                foVar2.getClass();
                foVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
