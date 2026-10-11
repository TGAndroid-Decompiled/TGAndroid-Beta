package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ek implements ValueAnimator.AnimatorUpdateListener {
    public final int f26109a;
    public final int f26110b;
    public final float f26111c;
    public final FrameLayout d;

    public ek(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f26109a = i11;
        this.d = frameLayout;
        this.f26110b = i10;
        this.f26111c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26109a) {
            case 0:
                sk skVar = (sk) this.d;
                hk hkVar = skVar.f30890r;
                hk hkVar2 = skVar.f30891s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f26110b;
                float f7 = this.f26111c;
                if (i10 == 1) {
                    hkVar.setTranslationX(f7 * floatValue);
                    hkVar.setAlpha(1.0f - floatValue);
                    hkVar.invalidate();
                    hkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    hkVar2.setScaleX(f10);
                    hkVar2.setScaleY(f10);
                    return;
                }
                hkVar2.setTranslationX(f7 * floatValue);
                hkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                hkVar2.invalidate();
                hkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                hkVar.setScaleX(f11);
                hkVar.setScaleY(f11);
                hkVar2.invalidate();
                return;
            default:
                pc0 pc0Var = (pc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((pc0Var.R * floatValue2) + (this.f26110b * f12));
                pc0Var.T = i11;
                pc0Var.e((pc0Var.S * floatValue2) + (this.f26111c * f12), i11);
                return;
        }
    }
}
