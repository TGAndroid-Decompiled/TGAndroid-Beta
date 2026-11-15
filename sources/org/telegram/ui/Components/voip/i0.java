package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ec1;
public final class i0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40651a;
    public final float f40652b;
    public final float f40653c;
    public final float d;
    public final Object f40654e;

    public i0(Object obj, float f10, float f11, float f12, int i7) {
        this.f40651a = i7;
        this.f40654e = obj;
        this.f40652b = f10;
        this.f40653c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40651a) {
            case 0:
                l0 l0Var = (l0) this.f40654e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f40760z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f40652b * floatValue);
                l0Var.f40750s0 = this.f40653c * floatValue;
                l0Var.f40751t0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ec1 ec1Var = (ec1) this.f40654e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.f46687f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f40652b * floatValue2);
                ec1Var.Y0 = this.f40653c * floatValue2;
                ec1Var.Z0 = this.d * floatValue2;
                ec1Var.f46706s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f40654e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f58893b;
                fVar.d = this.f40652b * floatValue3;
                fVar.f58858e = this.f40653c * floatValue3;
                fVar.f58861i = floatValue3 * this.d;
                return;
        }
    }
}
