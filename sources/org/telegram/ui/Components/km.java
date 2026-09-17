package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f27880a;
    public final pm f27881b;

    public km(pm pmVar, int i10) {
        this.f27880a = i10;
        this.f27881b = pmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27880a) {
            case 0:
                pm pmVar = this.f27881b;
                pmVar.getClass();
                pmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                return;
            default:
                pm pmVar2 = this.f27881b;
                pmVar2.getClass();
                pmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                return;
        }
    }
}
