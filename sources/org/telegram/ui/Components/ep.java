package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ep implements ValueAnimator.AnimatorUpdateListener {
    public boolean f22737a = false;
    public final sp f22738b;

    public ep(sp spVar) {
        this.f22738b = spVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sp spVar = this.f22738b;
        spVar.S = floatValue;
        spVar.R.invalidate();
        if (!this.f22737a && spVar.S > 0.5f) {
            this.f22737a = true;
        }
    }
}
