package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bk implements ValueAnimator.AnimatorUpdateListener {
    public final int f22774a;
    public final int f22775b;
    public final float f22776c;
    public final FrameLayout d;

    public bk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.f22774a = i11;
        this.d = frameLayout;
        this.f22775b = i10;
        this.f22776c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22774a) {
            case 0:
                pk pkVar = (pk) this.d;
                ek ekVar = pkVar.f27068r;
                ek ekVar2 = pkVar.f27069s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f22775b;
                float f7 = this.f22776c;
                if (i10 == 1) {
                    ekVar.setTranslationX(f7 * floatValue);
                    ekVar.setAlpha(1.0f - floatValue);
                    ekVar.invalidate();
                    ekVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ekVar2.setScaleX(f10);
                    ekVar2.setScaleY(f10);
                    return;
                }
                ekVar2.setTranslationX(f7 * floatValue);
                ekVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                ekVar2.invalidate();
                ekVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                ekVar.setScaleX(f11);
                ekVar.setScaleY(f11);
                ekVar2.invalidate();
                return;
            default:
                ob0 ob0Var = (ob0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((ob0Var.R * floatValue2) + (this.f22775b * f12));
                ob0Var.T = i11;
                ob0Var.e((ob0Var.S * floatValue2) + (this.f22776c * f12), i11);
                return;
        }
    }
}
