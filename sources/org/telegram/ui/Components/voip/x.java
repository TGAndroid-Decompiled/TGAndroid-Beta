package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ki1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29677a;
    public final float f29678b;
    public final float f29679c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29677a = i10;
        this.e = obj;
        this.f29678b = f7;
        this.f29679c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29677a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29435y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29678b * floatValue);
                m0Var.f29424r0 = this.f29679c * floatValue;
                m0Var.f29426s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                ki1 ki1Var = (ki1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki1Var.f35059f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29678b * floatValue2);
                ki1Var.Y0 = this.f29679c * floatValue2;
                ki1Var.Z0 = this.d * floatValue2;
                ki1Var.f35079s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f43270b;
                aVar.d = this.f29678b * floatValue3;
                aVar.e = this.f29679c * floatValue3;
                aVar.f43244g = floatValue3 * this.d;
                return;
        }
    }
}
