package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31904a;
    public final float f31905b;
    public final float f31906c;
    public final float d;
    public final Object f31907e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31904a = i10;
        this.f31907e = obj;
        this.f31905b = f7;
        this.f31906c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31904a) {
            case 0:
                l0 l0Var = (l0) this.f31907e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31630y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f31905b * floatValue);
                l0Var.f31619r0 = this.f31906c * floatValue;
                l0Var.f31621s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f31907e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f41124f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f31905b * floatValue2);
                ui1Var.Y0 = this.f31906c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f41144s.invalidate();
                return;
            default:
                tg.e eVar = (tg.e) this.f31907e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.a aVar = eVar.f46520b;
                aVar.d = this.f31905b * floatValue3;
                aVar.f46492e = this.f31906c * floatValue3;
                aVar.f46494g = floatValue3 * this.d;
                return;
        }
    }
}
