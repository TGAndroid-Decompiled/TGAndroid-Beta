package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30631a = false;
    public final np f30632b;

    public zo(np npVar) {
        this.f30632b = npVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f30632b;
        npVar.S = floatValue;
        npVar.R.invalidate();
        if (!this.f30631a && npVar.S > 0.5f) {
            this.f30631a = true;
        }
    }
}
