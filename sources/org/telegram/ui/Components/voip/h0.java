package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.jc1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39247a;
    public final float f39248b;
    public final float f39249c;
    public final float d;
    public final Object f39250e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39247a = i7;
        this.f39250e = obj;
        this.f39248b = f10;
        this.f39249c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39247a) {
            case 0:
                k0 k0Var = (k0) this.f39250e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39334y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39248b * floatValue);
                k0Var.f39323r0 = this.f39249c * floatValue;
                k0Var.f39325s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                jc1 jc1Var = (jc1) this.f39250e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc1Var.f46920e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39248b * floatValue2);
                jc1Var.X0 = this.f39249c * floatValue2;
                jc1Var.Y0 = this.d * floatValue2;
                jc1Var.f46942s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39250e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57420b;
                fVar.d = this.f39248b * floatValue3;
                fVar.f57385e = this.f39249c * floatValue3;
                fVar.f57388i = floatValue3 * this.d;
                return;
        }
    }
}
