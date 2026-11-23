package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wm implements ValueAnimator.AnimatorUpdateListener {
    public final int f41843a;
    public final tn f41844b;

    public wm(tn tnVar, int i7) {
        this.f41843a = i7;
        this.f41844b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41843a) {
            case 0:
                tn tnVar = this.f41844b;
                tnVar.getClass();
                tnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tn tnVar2 = this.f41844b;
                tnVar2.getClass();
                tnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
