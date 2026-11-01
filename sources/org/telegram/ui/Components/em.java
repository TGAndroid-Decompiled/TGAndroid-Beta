package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class em implements ValueAnimator.AnimatorUpdateListener {
    public final int f25882a;
    public final im f25883b;

    public em(im imVar, int i10) {
        this.f25882a = i10;
        this.f25883b = imVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25882a) {
            case 0:
                im imVar = this.f25883b;
                imVar.getClass();
                imVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.invalidate();
                return;
            default:
                im imVar2 = this.f25883b;
                imVar2.getClass();
                imVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar2.invalidate();
                return;
        }
    }
}
