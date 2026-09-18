package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.si1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29633a;
    public final float f29634b;
    public final float f29635c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29633a = i10;
        this.e = obj;
        this.f29634b = f7;
        this.f29635c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29633a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29385y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29634b * floatValue);
                m0Var.f29374r0 = this.f29635c * floatValue;
                m0Var.f29376s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                si1 si1Var = (si1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si1Var.f37310f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29634b * floatValue2);
                si1Var.Y0 = this.f29635c * floatValue2;
                si1Var.Z0 = this.d * floatValue2;
                si1Var.f37330s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f43195b;
                aVar.d = this.f29634b * floatValue3;
                aVar.e = this.f29635c * floatValue3;
                aVar.f43169g = floatValue3 * this.d;
                return;
        }
    }
}
