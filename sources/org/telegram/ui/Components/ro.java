package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ro implements ValueAnimator.AnimatorUpdateListener {
    public boolean f29988a = false;
    public final b11 f29989b;
    public final float f29990c;
    public final boolean d;
    public final dp e;

    public ro(dp dpVar, b11 b11Var, float f7, boolean z10) {
        this.e = dpVar;
        this.f29989b = b11Var;
        this.f29990c = f7;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dp dpVar = this.e;
        dpVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f29989b.setRadius(this.f29990c * floatValue);
        if (!this.f29988a && dpVar.I1 > 0.5f) {
            this.f29988a = true;
        }
    }
}
