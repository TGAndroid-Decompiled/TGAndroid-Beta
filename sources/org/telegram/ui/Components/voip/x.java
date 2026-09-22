package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f29334a;
    public final float f29335b;
    public final float f29336c;
    public final float d;
    public final Object e;

    public x(Object obj, float f7, float f10, float f11, int i10) {
        this.f29334a = i10;
        this.e = obj;
        this.f29335b = f7;
        this.f29336c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29334a) {
            case 0:
                m0 m0Var = (m0) this.e;
                m0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f29086y0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f29335b * floatValue);
                m0Var.f29075r0 = this.f29336c * floatValue;
                m0Var.f29077s0 = this.d * floatValue;
                m0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f37997f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f29335b * floatValue2);
                ui1Var.Y0 = this.f29336c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f38017s.invalidate();
                return;
            default:
                sg.e eVar = (sg.e) this.e;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.a aVar = eVar.f42933b;
                aVar.d = this.f29335b * floatValue3;
                aVar.e = this.f29336c * floatValue3;
                aVar.f42907g = floatValue3 * this.d;
                return;
        }
    }
}
