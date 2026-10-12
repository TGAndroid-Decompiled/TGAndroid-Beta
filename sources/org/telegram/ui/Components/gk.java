package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gk implements ValueAnimator.AnimatorUpdateListener {
    public final int f26447a;
    public final int f26448b;
    public final float f26449c;
    public final FrameLayout d;

    public gk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f26447a = i11;
        this.d = frameLayout;
        this.f26448b = i10;
        this.f26449c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26447a) {
            case 0:
                uk ukVar = (uk) this.d;
                jk jkVar = ukVar.f31186r;
                jk jkVar2 = ukVar.f31187s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f26448b;
                float f7 = this.f26449c;
                if (i10 == 1) {
                    jkVar.setTranslationX(f7 * floatValue);
                    jkVar.setAlpha(1.0f - floatValue);
                    jkVar.invalidate();
                    jkVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    jkVar2.setScaleX(f10);
                    jkVar2.setScaleY(f10);
                    return;
                }
                jkVar2.setTranslationX(f7 * floatValue);
                jkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                jkVar2.invalidate();
                jkVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                jkVar.setScaleX(f11);
                jkVar.setScaleY(f11);
                jkVar2.invalidate();
                return;
            default:
                tc0 tc0Var = (tc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((tc0Var.R * floatValue2) + (this.f26448b * f12));
                tc0Var.T = i11;
                tc0Var.e((tc0Var.S * floatValue2) + (this.f26449c * f12), i11);
                return;
        }
    }
}
