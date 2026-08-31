package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f28413a;
    public final pm f28414b;

    public km(pm pmVar, int i10) {
        this.f28413a = i10;
        this.f28414b = pmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28413a) {
            case 0:
                pm pmVar = this.f28414b;
                pmVar.getClass();
                pmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                return;
            default:
                pm pmVar2 = this.f28414b;
                pmVar2.getClass();
                pmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                return;
        }
    }
}
