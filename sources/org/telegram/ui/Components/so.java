package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class so implements ValueAnimator.AnimatorUpdateListener {
    public boolean f32695a = false;
    public final gp f32696b;

    public so(gp gpVar) {
        this.f32696b = gpVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gp gpVar = this.f32696b;
        gpVar.O = floatValue;
        gpVar.N.invalidate();
        if (!this.f32695a && gpVar.O > 0.5f) {
            this.f32695a = true;
        }
    }
}
