package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ph1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f34169a;
    public final float f34170b;
    public final float f34171c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f34169a = i10;
        this.e = obj;
        this.f34170b = f7;
        this.f34171c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34169a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f33931y0 = c3.h0.z(1.0f, floatValue, 1.0f, this.f34170b * floatValue);
                l0Var.f33920r0 = this.f34171c * floatValue;
                l0Var.f33922s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ph1 ph1Var = (ph1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph1Var.f42522f1 = c3.h0.z(1.0f, floatValue2, 1.0f, this.f34170b * floatValue2);
                ph1Var.Y0 = this.f34171c * floatValue2;
                ph1Var.Z0 = this.d * floatValue2;
                ph1Var.f42542s.invalidate();
                return;
            default:
                ug.n nVar = (ug.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = nVar.f49813b;
                gVar.d = this.f34170b * floatValue3;
                gVar.e = this.f34171c * floatValue3;
                gVar.f49781i = floatValue3 * this.d;
                return;
        }
    }
}
