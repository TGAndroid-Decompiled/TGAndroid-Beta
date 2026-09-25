package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.mi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29735a;
    public final float f29736b;
    public final float f29737c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29735a = i10;
        this.e = obj;
        this.f29736b = f7;
        this.f29737c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29735a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29493y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29736b * floatValue);
                m0Var.f29482r0 = this.f29737c * floatValue;
                m0Var.f29484s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                mi1 mi1Var = (mi1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.f35583f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29736b * floatValue2);
                mi1Var.Y0 = this.f29737c * floatValue2;
                mi1Var.Z0 = this.d * floatValue2;
                mi1Var.f35603s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f43226b;
                aVar.d = this.f29736b * floatValue3;
                aVar.e = this.f29737c * floatValue3;
                aVar.f43200g = floatValue3 * this.d;
                return;
        }
    }
}
