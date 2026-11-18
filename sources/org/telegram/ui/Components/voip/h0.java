package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.hc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40896a;
    public final float f40897b;
    public final float f40898c;
    public final float d;
    public final Object f40899e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f40896a = i7;
        this.f40899e = obj;
        this.f40897b = f10;
        this.f40898c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40896a) {
            case 0:
                k0 k0Var = (k0) this.f40899e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f41006z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f40897b * floatValue);
                k0Var.f40996s0 = this.f40898c * floatValue;
                k0Var.f40997t0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                hc1 hc1Var = (hc1) this.f40899e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hc1Var.f48348f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f40897b * floatValue2);
                hc1Var.Y0 = this.f40898c * floatValue2;
                hc1Var.Z0 = this.d * floatValue2;
                hc1Var.f48367s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f40899e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f59462b;
                fVar.d = this.f40897b * floatValue3;
                fVar.f59427e = this.f40898c * floatValue3;
                fVar.f59430i = floatValue3 * this.d;
                return;
        }
    }
}
