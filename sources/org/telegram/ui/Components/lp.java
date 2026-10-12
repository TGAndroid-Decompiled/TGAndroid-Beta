package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f27077a = false;
    public final zp f27078b;

    public lp(zp zpVar) {
        this.f27078b = zpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zp zpVar = this.f27078b;
        zpVar.S = floatValue;
        zpVar.R.invalidate();
        if (!this.f27077a && zpVar.S > 0.5f) {
            this.f27077a = true;
        }
    }
}
