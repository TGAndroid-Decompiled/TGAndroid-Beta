package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ki1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32341a;
    public final float f32342b;
    public final float f32343c;
    public final float d;
    public final Object f32344e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32341a = i10;
        this.f32344e = obj;
        this.f32342b = f7;
        this.f32343c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32341a) {
            case 0:
                m0 m0Var = (m0) this.f32344e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32081y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f32342b * floatValue);
                m0Var.f32070r0 = this.f32343c * floatValue;
                m0Var.f32072s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                ki1 ki1Var = (ki1) this.f32344e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki1Var.f38034f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f32342b * floatValue2);
                ki1Var.Y0 = this.f32343c * floatValue2;
                ki1Var.Z0 = this.d * floatValue2;
                ki1Var.f38054s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.f32344e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f46827b;
                aVar.d = this.f32342b * floatValue3;
                aVar.f46799e = this.f32343c * floatValue3;
                aVar.f46801g = floatValue3 * this.d;
                return;
        }
    }
}
