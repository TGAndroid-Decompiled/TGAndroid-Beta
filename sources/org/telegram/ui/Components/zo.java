package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30947a = false;
    public final np f30948b;

    public zo(np npVar) {
        this.f30948b = npVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f30948b;
        npVar.S = floatValue;
        npVar.R.invalidate();
        if (!this.f30947a && npVar.S > 0.5f) {
            this.f30947a = true;
        }
    }
}
