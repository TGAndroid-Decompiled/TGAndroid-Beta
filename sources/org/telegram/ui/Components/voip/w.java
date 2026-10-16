package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.cj1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f30235a;
    public final float f30236b;
    public final float f30237c;
    public final float d;
    public final Object e;

    public w(Object obj, float f7, float f10, float f11, int i10) {
        this.f30235a = i10;
        this.e = obj;
        this.f30236b = f7;
        this.f30237c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30235a) {
            case 0:
                l0 l0Var = (l0) this.e;
                l0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f29981y0 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue, 1.0f, this.f30236b * floatValue);
                l0Var.f29970r0 = this.f30237c * floatValue;
                l0Var.f29972s0 = this.d * floatValue;
                l0Var.invalidate();
                return;
            case 1:
                cj1 cj1Var = (cj1) this.e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj1Var.f34691f1 = com.google.android.gms.internal.play_billing.k3.y(1.0f, floatValue2, 1.0f, this.f30236b * floatValue2);
                cj1Var.Y0 = this.f30237c * floatValue2;
                cj1Var.Z0 = this.d * floatValue2;
                cj1Var.f34711s.invalidate();
                return;
            default:
                tg.n nVar = (tg.n) this.e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = nVar.f45740b;
                gVar.d = this.f30236b * floatValue3;
                gVar.e = this.f30237c * floatValue3;
                gVar.f45708i = floatValue3 * this.d;
                return;
        }
    }
}
