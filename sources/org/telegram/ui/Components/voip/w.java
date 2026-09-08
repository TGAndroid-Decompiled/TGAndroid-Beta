package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31930a;
    public final float f31931b;
    public final float f31932c;
    public final float d;
    public final Object f31933e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31930a = i10;
        this.f31933e = obj;
        this.f31931b = f7;
        this.f31932c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31930a) {
            case 0:
                l0 l0Var = (l0) this.f31933e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31656y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f31931b * floatValue);
                l0Var.f31645r0 = this.f31932c * floatValue;
                l0Var.f31647s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f31933e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f41150f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f31931b * floatValue2);
                ui1Var.Y0 = this.f31932c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f41170s.invalidate();
                return;
            default:
                tg.e eVar = (tg.e) this.f31933e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.a aVar = eVar.f46547b;
                aVar.d = this.f31931b * floatValue3;
                aVar.f46519e = this.f31932c * floatValue3;
                aVar.f46521g = floatValue3 * this.d;
                return;
        }
    }
}
