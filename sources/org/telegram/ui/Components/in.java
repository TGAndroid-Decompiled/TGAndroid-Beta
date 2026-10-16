package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class in implements ValueAnimator.AnimatorUpdateListener {
    public final int f25661a;
    public final io f25662b;

    public in(io ioVar, int i10) {
        this.f25661a = i10;
        this.f25662b = ioVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25661a) {
            case 0:
                io ioVar = this.f25662b;
                ioVar.getClass();
                ioVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                io ioVar2 = this.f25662b;
                ioVar2.getClass();
                ioVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
