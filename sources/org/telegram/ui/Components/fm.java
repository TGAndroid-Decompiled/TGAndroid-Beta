package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fm implements ValueAnimator.AnimatorUpdateListener {
    public final int f33592a;
    public final bn f33593b;

    public fm(bn bnVar, int i7) {
        this.f33592a = i7;
        this.f33593b = bnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33592a) {
            case 0:
                bn bnVar = this.f33593b;
                bnVar.getClass();
                bnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bn bnVar2 = this.f33593b;
                bnVar2.getClass();
                bnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
