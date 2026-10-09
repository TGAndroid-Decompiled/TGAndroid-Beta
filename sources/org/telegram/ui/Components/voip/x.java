package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.wi1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f32354a;
    public final float f32355b;
    public final float f32356c;
    public final float d;
    public final Object f32357e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f32354a = i10;
        this.f32357e = obj;
        this.f32355b = f7;
        this.f32356c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32354a) {
            case 0:
                m0 m0Var = (m0) this.f32357e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f32087y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32355b * floatValue);
                m0Var.f32076r0 = this.f32356c * floatValue;
                m0Var.f32078s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                wi1 wi1Var = (wi1) this.f32357e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi1Var.f43640f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32355b * floatValue2);
                wi1Var.Y0 = this.f32356c * floatValue2;
                wi1Var.Z0 = this.d * floatValue2;
                wi1Var.f43660s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32357e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48076b;
                gVar.d = this.f32355b * floatValue3;
                gVar.f48041e = this.f32356c * floatValue3;
                gVar.f48044i = floatValue3 * this.d;
                return;
        }
    }
}
