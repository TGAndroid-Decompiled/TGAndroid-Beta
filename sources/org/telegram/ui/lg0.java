package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class lg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37954a;
    public final pg0 f37955b;

    public lg0(pg0 pg0Var, int i10) {
        this.f37954a = i10;
        this.f37955b = pg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37954a) {
            case 0:
                pg0 pg0Var = this.f37955b;
                pg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.d.setAlpha(floatValue);
                pg0Var.e.setAlpha(floatValue);
                pg0Var.f39218f.setProgress(floatValue);
                FrameLayout frameLayout = pg0Var.f39222w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                pg0 pg0Var2 = this.f37955b;
                pg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.f39218f.setProgress(floatValue2);
                pg0Var2.d.setAlpha(floatValue2);
                pg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = pg0Var2.f39222w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
