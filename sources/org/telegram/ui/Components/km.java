package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f27852a;
    public final pm f27853b;

    public km(pm pmVar, int i10) {
        this.f27852a = i10;
        this.f27853b = pmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27852a) {
            case 0:
                pm pmVar = this.f27853b;
                pmVar.getClass();
                pmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                return;
            default:
                pm pmVar2 = this.f27853b;
                pmVar2.getClass();
                pmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                return;
        }
    }
}
