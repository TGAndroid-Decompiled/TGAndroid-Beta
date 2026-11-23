package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f36808a;
    public final om f36809b;

    public km(om omVar, int i7) {
        this.f36808a = i7;
        this.f36809b = omVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36808a) {
            case 0:
                om omVar = this.f36809b;
                omVar.getClass();
                omVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.invalidate();
                return;
            default:
                om omVar2 = this.f36809b;
                omVar2.getClass();
                omVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar2.invalidate();
                return;
        }
    }
}
