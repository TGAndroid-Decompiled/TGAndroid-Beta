package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f42527a = false;
    public final h01 f42528b;
    public final float f42529c;
    public final boolean d;
    public final kp f42530e;

    public yo(kp kpVar, h01 h01Var, float f10, boolean z10) {
        this.f42530e = kpVar;
        this.f42528b = h01Var;
        this.f42529c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kp kpVar = this.f42530e;
        kpVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f42528b.setRadius(this.f42529c * floatValue);
        if (!this.f42527a && kpVar.M1 > 0.5f) {
            this.f42527a = true;
        }
    }
}
