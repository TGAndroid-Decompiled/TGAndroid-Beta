package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ip implements ValueAnimator.AnimatorUpdateListener {
    public boolean f27307a = false;
    public final wp f27308b;

    public ip(wp wpVar) {
        this.f27308b = wpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wp wpVar = this.f27308b;
        wpVar.S = floatValue;
        wpVar.R.invalidate();
        if (!this.f27307a && wpVar.S > 0.5f) {
            this.f27307a = true;
        }
    }
}
