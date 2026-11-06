package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fm implements ValueAnimator.AnimatorUpdateListener {
    public final int f33585a;
    public final bn f33586b;

    public fm(bn bnVar, int i7) {
        this.f33585a = i7;
        this.f33586b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33585a) {
            case 0:
                bn bnVar = this.f33586b;
                bnVar.getClass();
                bnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bn bnVar2 = this.f33586b;
                bnVar2.getClass();
                bnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
