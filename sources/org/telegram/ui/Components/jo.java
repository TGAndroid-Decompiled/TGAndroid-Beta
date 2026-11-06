package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35000a = false;
    public final wz0 f35001b;
    public final float f35002c;
    public final boolean d;
    public final vo f35003e;

    public jo(vo voVar, wz0 wz0Var, float f10, boolean z9) {
        this.f35003e = voVar;
        this.f35001b = wz0Var;
        this.f35002c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35003e;
        voVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35001b.setRadius(this.f35002c * floatValue);
        if (!this.f35000a && voVar.I1 > 0.5f) {
            this.f35000a = true;
        }
    }
}
