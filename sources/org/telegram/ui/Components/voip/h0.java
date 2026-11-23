package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40994a;
    public final float f40995b;
    public final float f40996c;
    public final float d;
    public final Object f40997e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f40994a = i7;
        this.f40997e = obj;
        this.f40995b = f10;
        this.f40996c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40994a) {
            case 0:
                k0 k0Var = (k0) this.f40997e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f41104z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f40995b * floatValue);
                k0Var.f41094s0 = this.f40996c * floatValue;
                k0Var.f41095t0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                hc1 hc1Var = (hc1) this.f40997e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.f48311f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f40995b * floatValue2);
                hc1Var.Y0 = this.f40996c * floatValue2;
                hc1Var.Z0 = this.d * floatValue2;
                hc1Var.f48330s.invalidate();
                return;
            default:
                vg.n nVar = (vg.n) this.f40997e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.g gVar = nVar.f59470b;
                gVar.d = this.f40995b * floatValue3;
                gVar.f59435e = this.f40996c * floatValue3;
                gVar.f59438i = floatValue3 * this.d;
                return;
        }
    }
}
