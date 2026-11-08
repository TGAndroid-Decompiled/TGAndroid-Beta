package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35047a = false;
    public final xz0 f35048b;
    public final float f35049c;
    public final boolean d;
    public final vo f35050e;

    public jo(vo voVar, xz0 xz0Var, float f10, boolean z9) {
        this.f35050e = voVar;
        this.f35048b = xz0Var;
        this.f35049c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35050e;
        voVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35048b.setRadius(this.f35049c * floatValue);
        if (!this.f35047a && voVar.I1 > 0.5f) {
            this.f35047a = true;
        }
    }
}
