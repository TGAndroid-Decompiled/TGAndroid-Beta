package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gj implements ValueAnimator.AnimatorUpdateListener {
    public final int f34122a;
    public final int f34123b;
    public final float f34124c;
    public final FrameLayout d;

    public gj(FrameLayout frameLayout, int i3, float f10, int i10) {
        this.f34122a = i10;
        this.d = frameLayout;
        this.f34123b = i3;
        this.f34124c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34122a) {
            case 0:
                uj ujVar = (uj) this.d;
                jj jjVar = ujVar.f38770r;
                jj jjVar2 = ujVar.f38771s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i3 = this.f34123b;
                float f10 = this.f34124c;
                if (i3 == 1) {
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
                x90 x90Var = (x90) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((x90Var.S * floatValue2) + (this.f34123b * f13));
                x90Var.U = i10;
                x90Var.f((x90Var.T * floatValue2) + (this.f34124c * f13), i10);
                return;
        }
    }
}
