package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f41818a;
    public final tn f41819b;

    public wm(tn tnVar, int i7) {
        this.f41818a = i7;
        this.f41819b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41818a) {
            case 0:
                tn tnVar = this.f41819b;
                tnVar.getClass();
                tnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tn tnVar2 = this.f41819b;
                tnVar2.getClass();
                tnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
