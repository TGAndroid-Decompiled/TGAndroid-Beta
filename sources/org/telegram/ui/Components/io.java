package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class io implements ValueAnimator.AnimatorUpdateListener {
    public boolean f34710a = false;
    public final xz0 f34711b;
    public final float f34712c;
    public final boolean d;
    public final vo f34713e;

    public io(vo voVar, xz0 xz0Var, float f10, boolean z9) {
        this.f34713e = voVar;
        this.f34711b = xz0Var;
        this.f34712c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f34713e;
        voVar.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f34711b.setRadius(this.f34712c * floatValue);
        if (!this.f34710a && voVar.L1 > 0.5f) {
            this.f34710a = true;
        }
    }
}
