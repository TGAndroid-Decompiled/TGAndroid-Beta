package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.fc1;
public final class i0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40927a;
    public final float f40928b;
    public final float f40929c;
    public final float d;
    public final Object f40930e;

    public i0(Object obj, float f10, float f11, float f12, int i7) {
        this.f40927a = i7;
        this.f40930e = obj;
        this.f40928b = f10;
        this.f40929c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40927a) {
            case 0:
                l0 l0Var = (l0) this.f40930e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f41036z0 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue, 1.0f, this.f40928b * floatValue);
                l0Var.f41026s0 = this.f40929c * floatValue;
                l0Var.f41027t0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                fc1 fc1Var = (fc1) this.f40930e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc1Var.f47768f1 = com.google.android.gms.internal.vision.e2.z(1.0f, floatValue2, 1.0f, this.f40928b * floatValue2);
                fc1Var.Y0 = this.f40929c * floatValue2;
                fc1Var.Z0 = this.d * floatValue2;
                fc1Var.f47787s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f40930e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f59590b;
                fVar.d = this.f40928b * floatValue3;
                fVar.f59555e = this.f40929c * floatValue3;
                fVar.f59558i = floatValue3 * this.d;
                return;
        }
    }
}
