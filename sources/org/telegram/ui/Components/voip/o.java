package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f32225a;
    public final v f32226b;

    public o(v vVar, int i10) {
        this.f32225a = i10;
        this.f32226b = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f32225a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v vVar = this.f32226b;
                vVar.f32375a0 = floatValue;
                vVar.f32377b0.setAlpha(floatValue);
                vVar.f32374a.invalidate();
                return;
            default:
                v vVar2 = this.f32226b;
                q qVar = vVar2.f32374a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !vVar2.K0) {
                    vVar2.f32406x0.setAlpha(1.0f);
                    vVar2.K0 = true;
                    qVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                vVar2.f32406x0.setRotationY(f7);
                qVar.d.setRotationY(f7);
                return;
        }
    }
}
