package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lz implements ValueAnimator.AnimatorUpdateListener {
    public final int f28226a;
    public final rz f28227b;

    public lz(rz rzVar, int i10) {
        this.f28226a = i10;
        this.f28227b = rzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28226a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz rzVar = this.f28227b;
                rzVar.f30068y = floatValue;
                rzVar.invalidate();
                return;
            default:
                rz rzVar2 = this.f28227b;
                rzVar2.getClass();
                rzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar2.invalidate();
                return;
        }
    }
}
