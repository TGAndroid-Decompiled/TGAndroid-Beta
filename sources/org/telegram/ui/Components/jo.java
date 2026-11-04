package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jo implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35158a = false;
    public final wz0 f35159b;
    public final float f35160c;
    public final boolean d;
    public final vo f35161e;

    public jo(vo voVar, wz0 wz0Var, float f10, boolean z10) {
        this.f35161e = voVar;
        this.f35159b = wz0Var;
        this.f35160c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.f35161e;
        voVar.J1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.f35159b.setRadius(this.f35160c * floatValue);
        if (!this.f35158a && voVar.J1 > 0.5f) {
            this.f35158a = true;
        }
    }
}
