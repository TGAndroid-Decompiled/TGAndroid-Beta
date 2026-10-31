package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class em implements ValueAnimator.AnimatorUpdateListener {
    public final int f25829a;
    public final im f25830b;

    public em(im imVar, int i10) {
        this.f25829a = i10;
        this.f25830b = imVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25829a) {
            case 0:
                im imVar = this.f25830b;
                imVar.getClass();
                imVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.invalidate();
                return;
            default:
                im imVar2 = this.f25830b;
                imVar2.getClass();
                imVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar2.invalidate();
                return;
        }
    }
}
