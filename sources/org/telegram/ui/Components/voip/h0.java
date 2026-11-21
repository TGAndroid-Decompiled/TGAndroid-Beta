package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41031a;
    public final float f41032b;
    public final float f41033c;
    public final float d;
    public final Object f41034e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f41031a = i7;
        this.f41034e = obj;
        this.f41032b = f10;
        this.f41033c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41031a) {
            case 0:
                k0 k0Var = (k0) this.f41034e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f41141z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f41032b * floatValue);
                k0Var.f41131s0 = this.f41033c * floatValue;
                k0Var.f41132t0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                hc1 hc1Var = (hc1) this.f41034e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.f48342f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f41032b * floatValue2);
                hc1Var.Y0 = this.f41033c * floatValue2;
                hc1Var.Z0 = this.d * floatValue2;
                hc1Var.f48361s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f41034e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f59501b;
                fVar.d = this.f41032b * floatValue3;
                fVar.f59466e = this.f41033c * floatValue3;
                fVar.f59469i = floatValue3 * this.d;
                return;
        }
    }
}
