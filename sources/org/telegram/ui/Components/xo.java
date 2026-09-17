package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f32634a = false;
    public final lp f32635b;

    public xo(lp lpVar) {
        this.f32635b = lpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lp lpVar = this.f32635b;
        lpVar.S = floatValue;
        lpVar.R.invalidate();
        if (!this.f32634a && lpVar.S > 0.5f) {
            this.f32634a = true;
        }
    }
}
