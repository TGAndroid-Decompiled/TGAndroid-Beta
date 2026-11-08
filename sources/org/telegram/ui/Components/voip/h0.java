package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.fc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39238a;
    public final float f39239b;
    public final float f39240c;
    public final float d;
    public final Object f39241e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39238a = i7;
        this.f39241e = obj;
        this.f39239b = f10;
        this.f39240c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39238a) {
            case 0:
                k0 k0Var = (k0) this.f39241e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39325y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39239b * floatValue);
                k0Var.f39314r0 = this.f39240c * floatValue;
                k0Var.f39316s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                fc1 fc1Var = (fc1) this.f39241e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.f45552e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39239b * floatValue2);
                fc1Var.X0 = this.f39240c * floatValue2;
                fc1Var.Y0 = this.d * floatValue2;
                fc1Var.f45574s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39241e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57412b;
                fVar.d = this.f39239b * floatValue3;
                fVar.f57377e = this.f39240c * floatValue3;
                fVar.f57380i = floatValue3 * this.d;
                return;
        }
    }
}
