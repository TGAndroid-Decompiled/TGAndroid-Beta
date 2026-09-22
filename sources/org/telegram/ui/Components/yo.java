package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30308a = false;
    public final mp f30309b;

    public yo(mp mpVar) {
        this.f30309b = mpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mp mpVar = this.f30309b;
        mpVar.S = floatValue;
        mpVar.R.invalidate();
        if (!this.f30308a && mpVar.S > 0.5f) {
            this.f30308a = true;
        }
    }
}
