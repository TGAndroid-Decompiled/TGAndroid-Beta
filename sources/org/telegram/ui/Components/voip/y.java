package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f32413a;
    public final float f32414b;
    public final float f32415c;
    public final float d;
    public final Object f32416e;

    public y(Object obj, float f7, float f10, float f11, int i10) {
        this.f32413a = i10;
        this.f32416e = obj;
        this.f32414b = f7;
        this.f32415c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32413a) {
            case 0:
                n0 n0Var = (n0) this.f32416e;
                n0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f32146y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32414b * floatValue);
                n0Var.f32135r0 = this.f32415c * floatValue;
                n0Var.f32137s0 = this.d * floatValue;
                n0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f32416e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f42593f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32414b * floatValue2);
                ui1Var.Y0 = this.f32415c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f42613s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32416e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48168b;
                gVar.d = this.f32414b * floatValue3;
                gVar.f48133e = this.f32415c * floatValue3;
                gVar.f48136i = floatValue3 * this.d;
                return;
        }
    }
}
