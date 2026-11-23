package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41033a;
    public final float f41034b;
    public final float f41035c;
    public final float d;
    public final Object f41036e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f41033a = i7;
        this.f41036e = obj;
        this.f41034b = f10;
        this.f41035c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41033a) {
            case 0:
                k0 k0Var = (k0) this.f41036e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f41143z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f41034b * floatValue);
                k0Var.f41133s0 = this.f41035c * floatValue;
                k0Var.f41134t0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                hc1 hc1Var = (hc1) this.f41036e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.f48346f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f41034b * floatValue2);
                hc1Var.Y0 = this.f41035c * floatValue2;
                hc1Var.Z0 = this.d * floatValue2;
                hc1Var.f48365s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f41036e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f59505b;
                fVar.d = this.f41034b * floatValue3;
                fVar.f59470e = this.f41035c * floatValue3;
                fVar.f59473i = floatValue3 * this.d;
                return;
        }
    }
}
