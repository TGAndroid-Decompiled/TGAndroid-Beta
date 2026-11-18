package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f42917a = false;
    public final g01 f42918b;
    public final float f42919c;
    public final boolean d;
    public final lp f42920e;

    public zo(lp lpVar, g01 g01Var, float f10, boolean z10) {
        this.f42920e = lpVar;
        this.f42918b = g01Var;
        this.f42919c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lp lpVar = this.f42920e;
        lpVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f42918b.setRadius(this.f42919c * floatValue);
        if (!this.f42917a && lpVar.M1 > 0.5f) {
            this.f42917a = true;
        }
    }
}
