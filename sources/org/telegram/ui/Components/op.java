package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class op implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29554a = false;
    public final cq f29555b;

    public op(cq cqVar) {
        this.f29555b = cqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cq cqVar = this.f29555b;
        cqVar.S = floatValue;
        cqVar.R.invalidate();
        if (!this.f29554a && cqVar.S > 0.5f) {
            this.f29554a = true;
        }
    }
}
