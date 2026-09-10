package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.zi1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f28502a;
    public final float f28503b;
    public final float f28504c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f28502a = i10;
        this.e = obj;
        this.f28503b = f7;
        this.f28504c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28502a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f28272y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f28503b * floatValue);
                m0Var.f28261r0 = this.f28504c * floatValue;
                m0Var.f28263s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                zi1 zi1Var = (zi1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi1Var.f39371f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f28503b * floatValue2);
                zi1Var.Y0 = this.f28504c * floatValue2;
                zi1Var.Z0 = this.d * floatValue2;
                zi1Var.f39391s.invalidate();
                return;
            default:
                rg.f fVar = (rg.f) this.e;
                fVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rg.a aVar = fVar.f41485b;
                aVar.d = this.f28503b * floatValue3;
                aVar.e = this.f28504c * floatValue3;
                aVar.f41457g = floatValue3 * this.d;
                return;
        }
    }
}
