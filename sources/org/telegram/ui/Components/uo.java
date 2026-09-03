package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29269a = false;
    public final jp f29270b;

    public uo(jp jpVar) {
        this.f29270b = jpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jp jpVar = this.f29270b;
        jpVar.P = floatValue;
        jpVar.O.invalidate();
        if (!this.f29269a && jpVar.P > 0.5f) {
            this.f29269a = true;
        }
    }
}
