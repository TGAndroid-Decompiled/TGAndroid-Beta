package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f47035a;
    public final ww f47036b;

    public ju(ww wwVar, int i7) {
        this.f47035a = i7;
        this.f47036b = wwVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47035a) {
            case 0:
                this.f47036b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ww wwVar = this.f47036b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ww wwVar2 = this.f47036b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
