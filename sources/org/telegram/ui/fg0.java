package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class fg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37711a;
    public final jg0 f37712b;

    public fg0(jg0 jg0Var, int i10) {
        this.f37711a = i10;
        this.f37712b = jg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37711a) {
            case 0:
                jg0 jg0Var = this.f37712b;
                jg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg0Var.d.setAlpha(floatValue);
                jg0Var.f39078e.setAlpha(floatValue);
                jg0Var.f39079f.setProgress(floatValue);
                FrameLayout frameLayout = jg0Var.f39083w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                jg0 jg0Var2 = this.f37712b;
                jg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg0Var2.f39079f.setProgress(floatValue2);
                jg0Var2.d.setAlpha(floatValue2);
                jg0Var2.f39078e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = jg0Var2.f39083w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
