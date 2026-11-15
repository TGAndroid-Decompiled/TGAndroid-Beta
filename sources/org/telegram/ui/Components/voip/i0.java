package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ec1;
public final class i0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40648a;
    public final float f40649b;
    public final float f40650c;
    public final float d;
    public final Object f40651e;

    public i0(Object obj, float f10, float f11, float f12, int i7) {
        this.f40648a = i7;
        this.f40651e = obj;
        this.f40649b = f10;
        this.f40650c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40648a) {
            case 0:
                l0 l0Var = (l0) this.f40651e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f40757z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f40649b * floatValue);
                l0Var.f40747s0 = this.f40650c * floatValue;
                l0Var.f40748t0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ec1 ec1Var = (ec1) this.f40651e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.f46697f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f40649b * floatValue2);
                ec1Var.Y0 = this.f40650c * floatValue2;
                ec1Var.Z0 = this.d * floatValue2;
                ec1Var.f46716s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f40651e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f58893b;
                fVar.d = this.f40649b * floatValue3;
                fVar.f58858e = this.f40650c * floatValue3;
                fVar.f58861i = floatValue3 * this.d;
                return;
        }
    }
}
