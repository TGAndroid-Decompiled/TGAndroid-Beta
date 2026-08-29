package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class uj implements ValueAnimator.AnimatorUpdateListener {
    public final int f33245a;
    public final int f33246b;
    public final float f33247c;
    public final FrameLayout d;

    public uj(FrameLayout frameLayout, int i10, float f9, int i11) {
        this.f33245a = i11;
        this.d = frameLayout;
        this.f33246b = i10;
        this.f33247c = f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33245a) {
            case 0:
                jk jkVar = (jk) this.d;
                xj xjVar = jkVar.f29678r;
                xj xjVar2 = jkVar.f29679s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.f33246b;
                float f9 = this.f33247c;
                if (i10 == 1) {
                    xjVar.setTranslationX(f9 * floatValue);
                    xjVar.setAlpha(1.0f - floatValue);
                    xjVar.invalidate();
                    xjVar2.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    xjVar2.setScaleX(f10);
                    xjVar2.setScaleY(f10);
                    return;
                }
                xjVar2.setTranslationX(f9 * floatValue);
                xjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                xjVar2.invalidate();
                xjVar.setAlpha(floatValue);
                float f11 = (floatValue * 0.05f) + 0.95f;
                xjVar.setScaleX(f11);
                xjVar.setScaleY(f11);
                xjVar2.invalidate();
                return;
            default:
                lb0 lb0Var = (lb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((lb0Var.N * floatValue2) + (this.f33246b * f12));
                lb0Var.P = i11;
                lb0Var.e((lb0Var.O * floatValue2) + (this.f33247c * f12), i11);
                return;
        }
    }
}
