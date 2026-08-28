package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nz implements ValueAnimator.AnimatorUpdateListener {
    public final int f31219a;
    public final tz f31220b;

    public nz(tz tzVar, int i9) {
        this.f31219a = i9;
        this.f31220b = tzVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31219a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz tzVar = this.f31220b;
                tzVar.f32857x = floatValue;
                tzVar.invalidate();
                return;
            default:
                tz tzVar2 = this.f31220b;
                tzVar2.getClass();
                tzVar2.f32858y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tzVar2.invalidate();
                return;
        }
    }
}
