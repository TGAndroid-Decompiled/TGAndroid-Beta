package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fm implements ValueAnimator.AnimatorUpdateListener {
    public final int f33708a;
    public final bn f33709b;

    public fm(bn bnVar, int i7) {
        this.f33708a = i7;
        this.f33709b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33708a) {
            case 0:
                bn bnVar = this.f33709b;
                bnVar.getClass();
                bnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bn bnVar2 = this.f33709b;
                bnVar2.getClass();
                bnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
