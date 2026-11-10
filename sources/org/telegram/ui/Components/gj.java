package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gj implements ValueAnimator.AnimatorUpdateListener {
    public final int f33914a;
    public final int f33915b;
    public final float f33916c;
    public final FrameLayout d;

    public gj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f33914a = i10;
        this.d = frameLayout;
        this.f33915b = i7;
        this.f33916c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33914a) {
            case 0:
                uj ujVar = (uj) this.d;
                jj jjVar = ujVar.f38698r;
                jj jjVar2 = ujVar.f38699s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f33915b;
                float f10 = this.f33916c;
                if (i7 == 1) {
                    jjVar.setTranslationX(f10 * floatValue);
                    jjVar.setAlpha(1.0f - floatValue);
                    jjVar.invalidate();
                    jjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    jjVar2.setScaleX(f11);
                    jjVar2.setScaleY(f11);
                    return;
                }
                jjVar2.setTranslationX(f10 * floatValue);
                jjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                jjVar2.invalidate();
                jjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                jjVar.setScaleX(f12);
                jjVar.setScaleY(f12);
                jjVar2.invalidate();
                return;
            default:
                ca0 ca0Var = (ca0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ca0Var.R * floatValue2) + (this.f33915b * f13));
                ca0Var.T = i10;
                ca0Var.f((ca0Var.S * floatValue2) + (this.f33916c * f13), i10);
                return;
        }
    }
}
