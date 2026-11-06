package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ec1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39185a;
    public final float f39186b;
    public final float f39187c;
    public final float d;
    public final Object f39188e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39185a = i7;
        this.f39188e = obj;
        this.f39186b = f10;
        this.f39187c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39185a) {
            case 0:
                k0 k0Var = (k0) this.f39188e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39272y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39186b * floatValue);
                k0Var.f39261r0 = this.f39187c * floatValue;
                k0Var.f39263s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                ec1 ec1Var = (ec1) this.f39188e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.f45255e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39186b * floatValue2);
                ec1Var.X0 = this.f39187c * floatValue2;
                ec1Var.Y0 = this.d * floatValue2;
                ec1Var.f45277s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39188e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57295b;
                fVar.d = this.f39186b * floatValue3;
                fVar.f57260e = this.f39187c * floatValue3;
                fVar.f57263i = floatValue3 * this.d;
                return;
        }
    }
}
