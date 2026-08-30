package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29543a = false;
    public final kp f29544b;

    public vo(kp kpVar) {
        this.f29544b = kpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kp kpVar = this.f29544b;
        kpVar.P = floatValue;
        kpVar.O.invalidate();
        if (!this.f29543a && kpVar.P > 0.5f) {
            this.f29543a = true;
        }
    }
}
