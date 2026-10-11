package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.ui1;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f32477a;
    public final float f32478b;
    public final float f32479c;
    public final float d;
    public final Object f32480e;

    public y(Object obj, float f7, float f10, float f11, int i10) {
        this.f32477a = i10;
        this.f32480e = obj;
        this.f32478b = f7;
        this.f32479c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32477a) {
            case 0:
                n0 n0Var = (n0) this.f32480e;
                n0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f32210y0 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue, 1.0f, this.f32478b * floatValue);
                n0Var.f32199r0 = this.f32479c * floatValue;
                n0Var.f32201s0 = this.d * floatValue;
                n0Var.invalidate();
                return;
            case 1:
                ui1 ui1Var = (ui1) this.f32480e;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.f42627f1 = com.google.android.gms.internal.vision.e2.y(1.0f, floatValue2, 1.0f, this.f32478b * floatValue2);
                ui1Var.Y0 = this.f32479c * floatValue2;
                ui1Var.Z0 = this.d * floatValue2;
                ui1Var.f42647s.invalidate();
                return;
            default:
                sg.n nVar = (sg.n) this.f32480e;
                nVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = nVar.f48202b;
                gVar.d = this.f32478b * floatValue3;
                gVar.f48167e = this.f32479c * floatValue3;
                gVar.f48170i = floatValue3 * this.d;
                return;
        }
    }
}
