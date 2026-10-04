package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.mi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32267a;
    public final float f32268b;
    public final float f32269c;
    public final float d;
    public final Object f32270e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32267a = i10;
        this.f32270e = obj;
        this.f32268b = f7;
        this.f32269c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32267a) {
            case 0:
                m0 m0Var = (m0) this.f32270e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32007y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f32268b * floatValue);
                m0Var.f31996r0 = this.f32269c * floatValue;
                m0Var.f31998s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                mi1 mi1Var = (mi1) this.f32270e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.f38619f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f32268b * floatValue2);
                mi1Var.Y0 = this.f32269c * floatValue2;
                mi1Var.Z0 = this.d * floatValue2;
                mi1Var.f38639s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.f32270e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f46812b;
                aVar.d = this.f32268b * floatValue3;
                aVar.f46784e = this.f32269c * floatValue3;
                aVar.f46786g = floatValue3 * this.d;
                return;
        }
    }
}
