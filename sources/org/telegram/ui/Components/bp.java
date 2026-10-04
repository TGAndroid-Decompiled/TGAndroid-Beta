package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f25015a = false;
    public final pp f25016b;

    public bp(pp ppVar) {
        this.f25016b = ppVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pp ppVar = this.f25016b;
        ppVar.S = floatValue;
        ppVar.R.invalidate();
        if (!this.f25015a && ppVar.S > 0.5f) {
            this.f25015a = true;
        }
    }
}
