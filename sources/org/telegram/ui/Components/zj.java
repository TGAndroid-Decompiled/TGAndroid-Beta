package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class zj implements ValueAnimator.AnimatorUpdateListener {
    public final int f32920a;
    public final int f32921b;
    public final float f32922c;
    public final FrameLayout d;

    public zj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f32920a = i11;
        this.d = frameLayout;
        this.f32921b = i10;
        this.f32922c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32920a) {
            case 0:
                nk nkVar = (nk) this.d;
                ck ckVar = nkVar.f28826r;
                ck ckVar2 = nkVar.f28827s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f32921b;
                float f7 = this.f32922c;
                if (i10 == 1) {
                    ckVar.setTranslationX(f7 * floatValue);
                    ckVar.setAlpha(1.0f - floatValue);
                    ckVar.invalidate();
                    ckVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ckVar2.setScaleX(f10);
                    ckVar2.setScaleY(f10);
                    return;
                }
                ckVar2.setTranslationX(f7 * floatValue);
                ckVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ckVar2.invalidate();
                ckVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ckVar.setScaleX(f11);
                ckVar.setScaleY(f11);
                ckVar2.invalidate();
                return;
            default:
                ic0 ic0Var = (ic0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((ic0Var.R * floatValue2) + (this.f32921b * f12));
                ic0Var.T = i11;
                ic0Var.f((ic0Var.S * floatValue2) + (this.f32922c * f12), i11);
                return;
        }
    }
}
