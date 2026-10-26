package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ph1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f34172a;
    public final float f34173b;
    public final float f34174c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f34172a = i10;
        this.e = obj;
        this.f34173b = f7;
        this.f34174c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34172a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f33934y0 = c3.h0.z(1.0f, floatValue, 1.0f, this.f34173b * floatValue);
                l0Var.f33923r0 = this.f34174c * floatValue;
                l0Var.f33925s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ph1 ph1Var = (ph1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph1Var.f42525f1 = c3.h0.z(1.0f, floatValue2, 1.0f, this.f34173b * floatValue2);
                ph1Var.Y0 = this.f34174c * floatValue2;
                ph1Var.Z0 = this.d * floatValue2;
                ph1Var.f42545s.invalidate();
                return;
            default:
                ug.n nVar = (ug.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = nVar.f49816b;
                gVar.d = this.f34173b * floatValue3;
                gVar.e = this.f34174c * floatValue3;
                gVar.f49784i = floatValue3 * this.d;
                return;
        }
    }
}
