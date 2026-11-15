package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class oj implements ValueAnimator.AnimatorUpdateListener {
    public final int f38001a;
    public final int f38002b;
    public final float f38003c;
    public final FrameLayout d;

    public oj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.f38001a = i10;
        this.d = frameLayout;
        this.f38002b = i7;
        this.f38003c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38001a) {
            case 0:
                dk dkVar = (dk) this.d;
                rj rjVar = dkVar.f33952r;
                rj rjVar2 = dkVar.f33953s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.f38002b;
                float f10 = this.f38003c;
                if (i7 == 1) {
                    rjVar.setTranslationX(f10 * floatValue);
                    rjVar.setAlpha(1.0f - floatValue);
                    rjVar.invalidate();
                    rjVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    rjVar2.setScaleX(f11);
                    rjVar2.setScaleY(f11);
                    return;
                }
                rjVar2.setTranslationX(f10 * floatValue);
                rjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                rjVar2.invalidate();
                rjVar.setAlpha(floatValue);
                float f12 = (floatValue * 0.05f) + 0.95f;
                rjVar.setScaleX(f12);
                rjVar.setScaleY(f12);
                rjVar2.invalidate();
                return;
            default:
                ea0 ea0Var = (ea0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ea0Var.S * floatValue2) + (this.f38002b * f13));
                ea0Var.U = i10;
                ea0Var.f((ea0Var.T * floatValue2) + (this.f38003c * f13), i10);
                return;
        }
    }
}
