package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.oh1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f31984a;
    public final float f31985b;
    public final float f31986c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f31984a = i10;
        this.e = obj;
        this.f31985b = f7;
        this.f31986c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31984a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f31731y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f31985b * floatValue);
                l0Var.f31720r0 = this.f31986c * floatValue;
                l0Var.f31722s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                oh1 oh1Var = (oh1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.f40178f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f31985b * floatValue2);
                oh1Var.Y0 = this.f31986c * floatValue2;
                oh1Var.Z0 = this.d * floatValue2;
                oh1Var.f40198s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f47547b;
                gVar.d = this.f31985b * floatValue3;
                gVar.e = this.f31986c * floatValue3;
                gVar.f47515i = floatValue3 * this.d;
                return;
        }
    }
}
