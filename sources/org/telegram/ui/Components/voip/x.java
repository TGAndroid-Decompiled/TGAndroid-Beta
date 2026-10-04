package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.mi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32268a;
    public final float f32269b;
    public final float f32270c;
    public final float d;
    public final Object f32271e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32268a = i10;
        this.f32271e = obj;
        this.f32269b = f7;
        this.f32270c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32268a) {
            case 0:
                m0 m0Var = (m0) this.f32271e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32008y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f32269b * floatValue);
                m0Var.f31997r0 = this.f32270c * floatValue;
                m0Var.f31999s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                mi1 mi1Var = (mi1) this.f32271e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.f38620f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f32269b * floatValue2);
                mi1Var.Y0 = this.f32270c * floatValue2;
                mi1Var.Z0 = this.d * floatValue2;
                mi1Var.f38640s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.f32271e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f46813b;
                aVar.d = this.f32269b * floatValue3;
                aVar.f46785e = this.f32270c * floatValue3;
                aVar.f46787g = floatValue3 * this.d;
                return;
        }
    }
}
