package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qp implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29876a = false;
    public final eq f29877b;

    public qp(eq eqVar) {
        this.f29877b = eqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eq eqVar = this.f29877b;
        eqVar.S = floatValue;
        eqVar.R.invalidate();
        if (!this.f29876a && eqVar.S > 0.5f) {
            this.f29876a = true;
        }
    }
}
