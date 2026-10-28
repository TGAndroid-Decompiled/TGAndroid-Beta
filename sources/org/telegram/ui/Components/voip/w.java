package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.rh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f34277a;
    public final float f34278b;
    public final float f34279c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f34277a = i10;
        this.e = obj;
        this.f34278b = f7;
        this.f34279c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34277a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f34039y0 = c3.h0.z(1.0f, floatValue, 1.0f, this.f34278b * floatValue);
                l0Var.f34028r0 = this.f34279c * floatValue;
                l0Var.f34030s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                rh1 rh1Var = (rh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh1Var.f43015f1 = c3.h0.z(1.0f, floatValue2, 1.0f, this.f34278b * floatValue2);
                rh1Var.Y0 = this.f34279c * floatValue2;
                rh1Var.Z0 = this.d * floatValue2;
                rh1Var.f43035s.invalidate();
                return;
            default:
                ug.n nVar = (ug.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = nVar.f49851b;
                gVar.d = this.f34278b * floatValue3;
                gVar.e = this.f34279c * floatValue3;
                gVar.f49819i = floatValue3 * this.d;
                return;
        }
    }
}
