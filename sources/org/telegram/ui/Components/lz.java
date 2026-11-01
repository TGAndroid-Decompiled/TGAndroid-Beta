package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lz implements ValueAnimator.AnimatorUpdateListener {
    public final int f28308a;
    public final rz f28309b;

    public lz(rz rzVar, int i10) {
        this.f28308a = i10;
        this.f28309b = rzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28308a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz rzVar = this.f28309b;
                rzVar.f30123y = floatValue;
                rzVar.invalidate();
                return;
            default:
                rz rzVar2 = this.f28309b;
                rzVar2.getClass();
                rzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar2.invalidate();
                return;
        }
    }
}
