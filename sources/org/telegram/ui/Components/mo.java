package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class mo implements ValueAnimator.AnimatorUpdateListener {

    public boolean f30728a = false;

    public final ap f30729b;

    public mo(ap apVar) {
        this.f30729b = apVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ap apVar = this.f30729b;
        apVar.O = fFloatValue;
        apVar.N.invalidate();
        if (this.f30728a || apVar.O <= 0.5f) {
            return;
        }
        this.f30728a = true;
    }
}
