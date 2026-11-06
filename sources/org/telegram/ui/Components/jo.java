package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35039a = false;
    public final wz0 f35040b;
    public final float f35041c;
    public final boolean d;
    public final vo f35042e;

    public jo(vo voVar, wz0 wz0Var, float f10, boolean z9) {
        this.f35042e = voVar;
        this.f35040b = wz0Var;
        this.f35041c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35042e;
        voVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35040b.setRadius(this.f35041c * floatValue);
        if (!this.f35039a && voVar.I1 > 0.5f) {
            this.f35039a = true;
        }
    }
}
