package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class op implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29446a = false;
    public final cq f29447b;

    public op(cq cqVar) {
        this.f29447b = cqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cq cqVar = this.f29447b;
        cqVar.S = floatValue;
        cqVar.R.invalidate();
        if (!this.f29446a && cqVar.S > 0.5f) {
            this.f29446a = true;
        }
    }
}
