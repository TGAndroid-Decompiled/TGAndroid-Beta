package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jm implements ValueAnimator.AnimatorUpdateListener {
    public final int f28142a;
    public final om f28143b;

    public jm(om omVar, int i10) {
        this.f28142a = i10;
        this.f28143b = omVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28142a) {
            case 0:
                om omVar = this.f28143b;
                omVar.getClass();
                omVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.invalidate();
                return;
            default:
                om omVar2 = this.f28143b;
                omVar2.getClass();
                omVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar2.invalidate();
                return;
        }
    }
}
