package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35101a = false;
    public final yz0 f35102b;
    public final float f35103c;
    public final boolean d;
    public final vo f35104e;

    public jo(vo voVar, yz0 yz0Var, float f10, boolean z9) {
        this.f35104e = voVar;
        this.f35102b = yz0Var;
        this.f35103c = f10;
        this.d = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35104e;
        voVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35102b.setRadius(this.f35103c * floatValue);
        if (!this.f35101a && voVar.I1 > 0.5f) {
            this.f35101a = true;
        }
    }
}
