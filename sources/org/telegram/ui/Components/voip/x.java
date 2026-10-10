package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.wi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32419a;
    public final float f32420b;
    public final float f32421c;
    public final float d;
    public final Object f32422e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32419a = i10;
        this.f32422e = obj;
        this.f32420b = f7;
        this.f32421c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32419a) {
            case 0:
                m0 m0Var = (m0) this.f32422e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32152y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32420b * floatValue);
                m0Var.f32141r0 = this.f32421c * floatValue;
                m0Var.f32143s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                wi1 wi1Var = (wi1) this.f32422e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi1Var.f43686f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32420b * floatValue2);
                wi1Var.Y0 = this.f32421c * floatValue2;
                wi1Var.Z0 = this.d * floatValue2;
                wi1Var.f43706s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32422e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48122b;
                gVar.d = this.f32420b * floatValue3;
                gVar.f48087e = this.f32421c * floatValue3;
                gVar.f48090i = floatValue3 * this.d;
                return;
        }
    }
}
