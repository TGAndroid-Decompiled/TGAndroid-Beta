package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f22989a = false;
    public final pp f22990b;

    public bp(pp ppVar) {
        this.f22990b = ppVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pp ppVar = this.f22990b;
        ppVar.S = floatValue;
        ppVar.R.invalidate();
        if (!this.f22989a && ppVar.S > 0.5f) {
            this.f22989a = true;
        }
    }
}
