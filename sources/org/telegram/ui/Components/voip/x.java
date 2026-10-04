package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.mi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32274a;
    public final float f32275b;
    public final float f32276c;
    public final float d;
    public final Object f32277e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32274a = i10;
        this.f32277e = obj;
        this.f32275b = f7;
        this.f32276c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32274a) {
            case 0:
                m0 m0Var = (m0) this.f32277e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32014y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f32275b * floatValue);
                m0Var.f32003r0 = this.f32276c * floatValue;
                m0Var.f32005s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                mi1 mi1Var = (mi1) this.f32277e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.f38625f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f32275b * floatValue2);
                mi1Var.Y0 = this.f32276c * floatValue2;
                mi1Var.Z0 = this.d * floatValue2;
                mi1Var.f38645s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.f32277e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f46820b;
                aVar.d = this.f32275b * floatValue3;
                aVar.f46792e = this.f32276c * floatValue3;
                aVar.f46794g = floatValue3 * this.d;
                return;
        }
    }
}
