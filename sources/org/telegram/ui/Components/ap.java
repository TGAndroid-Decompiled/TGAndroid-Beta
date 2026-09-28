package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ap implements ValueAnimator.AnimatorUpdateListener {
    public boolean f22705a = false;
    public final op f22706b;

    public ap(op opVar) {
        this.f22706b = opVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        op opVar = this.f22706b;
        opVar.S = floatValue;
        opVar.R.invalidate();
        if (!this.f22705a && opVar.S > 0.5f) {
            this.f22705a = true;
        }
    }
}
