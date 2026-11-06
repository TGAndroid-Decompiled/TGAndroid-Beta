package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35026a = false;
    public final xz0 f35027b;
    public final float f35028c;
    public final boolean d;
    public final vo f35029e;

    public jo(vo voVar, xz0 xz0Var, float f10, boolean z9) {
        this.f35029e = voVar;
        this.f35027b = xz0Var;
        this.f35028c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35029e;
        voVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35027b.setRadius(this.f35028c * floatValue);
        if (!this.f35026a && voVar.I1 > 0.5f) {
            this.f35026a = true;
        }
    }
}
