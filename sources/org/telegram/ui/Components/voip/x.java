package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ti1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29317a;
    public final float f29318b;
    public final float f29319c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29317a = i10;
        this.e = obj;
        this.f29318b = f7;
        this.f29319c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29317a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29069y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29318b * floatValue);
                m0Var.f29058r0 = this.f29319c * floatValue;
                m0Var.f29060s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                ti1 ti1Var = (ti1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.f37776f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29318b * floatValue2);
                ti1Var.Y0 = this.f29319c * floatValue2;
                ti1Var.Z0 = this.d * floatValue2;
                ti1Var.f37796s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f42964b;
                aVar.d = this.f29318b * floatValue3;
                aVar.e = this.f29319c * floatValue3;
                aVar.f42938g = floatValue3 * this.d;
                return;
        }
    }
}
