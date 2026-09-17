package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f32661a = false;
    public final lp f32662b;

    public xo(lp lpVar) {
        this.f32662b = lpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lp lpVar = this.f32662b;
        lpVar.S = floatValue;
        lpVar.R.invalidate();
        if (!this.f32661a && lpVar.S > 0.5f) {
            this.f32661a = true;
        }
    }
}
