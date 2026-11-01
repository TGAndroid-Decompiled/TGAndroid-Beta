package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ro implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30049a = false;
    public final c11 f30050b;
    public final float f30051c;
    public final boolean d;
    public final dp e;

    public ro(dp dpVar, c11 c11Var, float f7, boolean z10) {
        this.e = dpVar;
        this.f30050b = c11Var;
        this.f30051c = f7;
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
        this.f30050b.setRadius(this.f30051c * floatValue);
        if (!this.f30049a && dpVar.I1 > 0.5f) {
            this.f30049a = true;
        }
    }
}
