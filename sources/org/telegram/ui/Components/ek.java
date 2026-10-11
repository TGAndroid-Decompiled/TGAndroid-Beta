package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ek implements ValueAnimator.AnimatorUpdateListener {
    public final int f26033a;
    public final int f26034b;
    public final float f26035c;
    public final FrameLayout d;

    public ek(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f26033a = i11;
        this.d = frameLayout;
        this.f26034b = i10;
        this.f26035c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26033a) {
            case 0:
                sk skVar = (sk) this.d;
                hk hkVar = skVar.f30769r;
                hk hkVar2 = skVar.f30770s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f26034b;
                float f7 = this.f26035c;
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
                qc0 qc0Var = (qc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((qc0Var.R * floatValue2) + (this.f26034b * f12));
                qc0Var.T = i11;
                qc0Var.e((qc0Var.S * floatValue2) + (this.f26035c * f12), i11);
                return;
        }
    }
}
