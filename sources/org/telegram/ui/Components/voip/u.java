package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.zb1;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f39617a;
    public final float f39618b;
    public final float f39619c;
    public final float d;
    public final Object f39620e;

    public u(Object obj, float f10, float f11, float f12, int i3) {
        this.f39617a = i3;
        this.f39620e = obj;
        this.f39618b = f10;
        this.f39619c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39617a) {
            case 0:
                x xVar = (x) this.f39620e;
                xVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.f39703z0 = com.google.android.recaptcha.internal.a.y(1.0f, floatValue, 1.0f, this.f39618b * floatValue);
                xVar.f39693s0 = this.f39619c * floatValue;
                xVar.f39694t0 = this.d * floatValue;
                xVar.invalidate();
                return;
            case 1:
                zb1 zb1Var = (zb1) this.f39620e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb1Var.f52622g1 = com.google.android.recaptcha.internal.a.y(1.0f, floatValue2, 1.0f, this.f39618b * floatValue2);
                zb1Var.Z0 = this.f39619c * floatValue2;
                zb1Var.f52606a1 = this.d * floatValue2;
                zb1Var.f52640s.invalidate();
                return;
            default:
                wg.m mVar = (wg.m) this.f39620e;
                mVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = mVar.f57666b;
                fVar.d = this.f39618b * floatValue3;
                fVar.f57631e = this.f39619c * floatValue3;
                fVar.f57634i = floatValue3 * this.d;
                return;
        }
    }
}
