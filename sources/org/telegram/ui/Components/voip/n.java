package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f32197a;
    public final u f32198b;

    public n(u uVar, int i10) {
        this.f32197a = i10;
        this.f32198b = uVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.f32197a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.f32198b;
                uVar.U = floatValue;
                uVar.V.setAlpha(floatValue);
                uVar.f32360a.invalidate();
                return;
            default:
                u uVar2 = this.f32198b;
                p pVar = uVar2.f32360a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z4 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z4 = true;
                }
                if (z4 && !uVar2.H0) {
                    uVar2.f32387u0.setAlpha(1.0f);
                    uVar2.H0 = true;
                    pVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                uVar2.f32387u0.setRotationY(f10);
                pVar.d.setRotationY(f10);
                return;
        }
    }
}
