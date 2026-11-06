package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wl implements ValueAnimator.AnimatorUpdateListener {
    public final int f40041a;
    public final am f40042b;

    public wl(am amVar, int i7) {
        this.f40041a = i7;
        this.f40042b = amVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40041a) {
            case 0:
                am amVar = this.f40042b;
                amVar.getClass();
                amVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar.invalidate();
                return;
            default:
                am amVar2 = this.f40042b;
                amVar2.getClass();
                amVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar2.invalidate();
                return;
        }
    }
}
