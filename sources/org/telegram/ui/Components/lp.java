package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f26778a = false;
    public final zp f26779b;

    public lp(zp zpVar) {
        this.f26779b = zpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zp zpVar = this.f26779b;
        zpVar.S = floatValue;
        zpVar.R.invalidate();
        if (!this.f26778a && zpVar.S > 0.5f) {
            this.f26778a = true;
        }
    }
}
