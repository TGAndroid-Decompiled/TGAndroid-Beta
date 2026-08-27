package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class im implements ValueAnimator.AnimatorUpdateListener {

    public final int f29406a;

    public final in f29407b;

    public im(in inVar, int i10) {
        this.f29406a = i10;
        this.f29407b = inVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29406a) {
            case 0:
                in inVar = this.f29407b;
                inVar.getClass();
                inVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                in inVar2 = this.f29407b;
                inVar2.getClass();
                inVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
