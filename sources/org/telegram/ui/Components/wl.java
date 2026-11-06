package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wl implements ValueAnimator.AnimatorUpdateListener {
    public final int f40049a;
    public final am f40050b;

    public wl(am amVar, int i7) {
        this.f40049a = i7;
        this.f40050b = amVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40049a) {
            case 0:
                am amVar = this.f40050b;
                amVar.getClass();
                amVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar.invalidate();
                return;
            default:
                am amVar2 = this.f40050b;
                amVar2.getClass();
                amVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar2.invalidate();
                return;
        }
    }
}
