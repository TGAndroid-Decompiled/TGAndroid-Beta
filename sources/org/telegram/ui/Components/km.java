package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f25652a;
    public final pm f25653b;

    public km(pm pmVar, int i10) {
        this.f25652a = i10;
        this.f25653b = pmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25652a) {
            case 0:
                pm pmVar = this.f25653b;
                pmVar.getClass();
                pmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                return;
            default:
                pm pmVar2 = this.f25653b;
                pmVar2.getClass();
                pmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                return;
        }
    }
}
