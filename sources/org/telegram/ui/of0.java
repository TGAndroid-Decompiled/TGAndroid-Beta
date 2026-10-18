package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class of0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39776a;
    public final sf0 f39777b;

    public of0(sf0 sf0Var, int i10) {
        this.f39776a = i10;
        this.f39777b = sf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39776a) {
            case 0:
                sf0 sf0Var = this.f39777b;
                sf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf0Var.d.setAlpha(floatValue);
                sf0Var.e.setAlpha(floatValue);
                sf0Var.f41079f.setProgress(floatValue);
                FrameLayout frameLayout = sf0Var.f41083w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                sf0 sf0Var2 = this.f39777b;
                sf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf0Var2.f41079f.setProgress(floatValue2);
                sf0Var2.d.setAlpha(floatValue2);
                sf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = sf0Var2.f41083w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
