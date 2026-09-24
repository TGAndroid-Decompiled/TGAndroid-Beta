package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.mi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29725a;
    public final float f29726b;
    public final float f29727c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29725a = i10;
        this.e = obj;
        this.f29726b = f7;
        this.f29727c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29725a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29483y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29726b * floatValue);
                m0Var.f29472r0 = this.f29727c * floatValue;
                m0Var.f29474s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                mi1 mi1Var = (mi1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.f35570f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29726b * floatValue2);
                mi1Var.Y0 = this.f29727c * floatValue2;
                mi1Var.Z0 = this.d * floatValue2;
                mi1Var.f35590s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f43211b;
                aVar.d = this.f29726b * floatValue3;
                aVar.e = this.f29727c * floatValue3;
                aVar.f43185g = floatValue3 * this.d;
                return;
        }
    }
}
