package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ec1;
public final class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39203a;
    public final float f39204b;
    public final float f39205c;
    public final float d;
    public final Object f39206e;

    public h0(Object obj, float f10, float f11, float f12, int i7) {
        this.f39203a = i7;
        this.f39206e = obj;
        this.f39204b = f10;
        this.f39205c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39203a) {
            case 0:
                k0 k0Var = (k0) this.f39206e;
                k0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f39290y0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, 1.0f, this.f39204b * floatValue);
                k0Var.f39279r0 = this.f39205c * floatValue;
                k0Var.f39281s0 = this.d * floatValue;
                k0Var.invalidate();
                return;
            case 1:
                ec1 ec1Var = (ec1) this.f39206e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec1Var.f45284e1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f39204b * floatValue2);
                ec1Var.X0 = this.f39205c * floatValue2;
                ec1Var.Y0 = this.d * floatValue2;
                ec1Var.f45306s.invalidate();
                return;
            default:
                vg.m mVar = (vg.m) this.f39206e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = mVar.f57319b;
                fVar.d = this.f39204b * floatValue3;
                fVar.f57284e = this.f39205c * floatValue3;
                fVar.f57287i = floatValue3 * this.d;
                return;
        }
    }
}
