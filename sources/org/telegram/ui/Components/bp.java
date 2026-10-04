package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f25021a = false;
    public final pp f25022b;

    public bp(pp ppVar) {
        this.f25022b = ppVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pp ppVar = this.f25022b;
        ppVar.S = floatValue;
        ppVar.R.invalidate();
        if (!this.f25021a && ppVar.S > 0.5f) {
            this.f25021a = true;
        }
    }
}
