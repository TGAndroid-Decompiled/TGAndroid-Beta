package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ic1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39327a;
    public final float f39328b;
    public final float f39329c;
    public final float d;
    public final Object f39330e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39327a = i7;
        this.f39330e = obj;
        this.f39328b = f10;
        this.f39329c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39327a) {
            case 0:
                k0 k0Var = (k0) this.f39330e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39414y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39328b * floatValue);
                k0Var.f39403r0 = this.f39329c * floatValue;
                k0Var.f39405s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                ic1 ic1Var = (ic1) this.f39330e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ic1Var.f46584e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39328b * floatValue2);
                ic1Var.X0 = this.f39329c * floatValue2;
                ic1Var.Y0 = this.d * floatValue2;
                ic1Var.f46606s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39330e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57424b;
                fVar.d = this.f39328b * floatValue3;
                fVar.f57389e = this.f39329c * floatValue3;
                fVar.f57392i = floatValue3 * this.d;
                return;
        }
    }
}
