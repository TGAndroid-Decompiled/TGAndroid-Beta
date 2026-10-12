package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29878a = false;
    public final eq f29879b;

    public qp(eq eqVar) {
        this.f29879b = eqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eq eqVar = this.f29879b;
        eqVar.S = floatValue;
        eqVar.R.invalidate();
        if (!this.f29878a && eqVar.S > 0.5f) {
            this.f29878a = true;
        }
    }
}
