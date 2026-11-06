package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fm implements ValueAnimator.AnimatorUpdateListener {
    public final int f33631a;
    public final bn f33632b;

    public fm(bn bnVar, int i7) {
        this.f33631a = i7;
        this.f33632b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33631a) {
            case 0:
                bn bnVar = this.f33632b;
                bnVar.getClass();
                bnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bn bnVar2 = this.f33632b;
                bnVar2.getClass();
                bnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
