package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31903a;
    public final float f31904b;
    public final float f31905c;
    public final float d;
    public final Object f31906e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31903a = i10;
        this.f31906e = obj;
        this.f31904b = f7;
        this.f31905c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31903a) {
            case 0:
                l0 l0Var = (l0) this.f31906e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31629y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f31904b * floatValue);
                l0Var.f31618r0 = this.f31905c * floatValue;
                l0Var.f31620s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f31906e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f41123f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f31904b * floatValue2);
                ui1Var.Y0 = this.f31905c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f41143s.invalidate();
                return;
            default:
                tg.e eVar = (tg.e) this.f31906e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.a aVar = eVar.f46519b;
                aVar.d = this.f31904b * floatValue3;
                aVar.f46491e = this.f31905c * floatValue3;
                aVar.f46493g = floatValue3 * this.d;
                return;
        }
    }
}
