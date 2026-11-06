package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ec1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39182a;
    public final float f39183b;
    public final float f39184c;
    public final float d;
    public final Object f39185e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39182a = i7;
        this.f39185e = obj;
        this.f39183b = f10;
        this.f39184c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39182a) {
            case 0:
                k0 k0Var = (k0) this.f39185e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39269y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39183b * floatValue);
                k0Var.f39258r0 = this.f39184c * floatValue;
                k0Var.f39260s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                ec1 ec1Var = (ec1) this.f39185e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.f45285e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39183b * floatValue2);
                ec1Var.X0 = this.f39184c * floatValue2;
                ec1Var.Y0 = this.d * floatValue2;
                ec1Var.f45307s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39185e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57320b;
                fVar.d = this.f39183b * floatValue3;
                fVar.f57285e = this.f39184c * floatValue3;
                fVar.f57288i = floatValue3 * this.d;
                return;
        }
    }
}
