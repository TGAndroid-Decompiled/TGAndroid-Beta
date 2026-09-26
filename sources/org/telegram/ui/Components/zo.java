package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30951a = false;
    public final np f30952b;

    public zo(np npVar) {
        this.f30952b = npVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        np npVar = this.f30952b;
        npVar.S = floatValue;
        npVar.R.invalidate();
        if (!this.f30951a && npVar.S > 0.5f) {
            this.f30951a = true;
        }
    }
}
