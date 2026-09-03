package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33142a = false;
    public final mp f33143b;

    public xo(mp mpVar) {
        this.f33143b = mpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mp mpVar = this.f33143b;
        mpVar.P = floatValue;
        mpVar.O.invalidate();
        if (!this.f33142a && mpVar.P > 0.5f) {
            this.f33142a = true;
        }
    }
}
