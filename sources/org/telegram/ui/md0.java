package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class md0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47788a;
    public final pd0 f47789b;

    public md0(pd0 pd0Var, int i7) {
        this.f47788a = i7;
        this.f47789b = pd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47788a) {
            case 0:
                pd0 pd0Var = this.f47789b;
                pd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var.d.setAlpha(floatValue);
                pd0Var.f48804e.setAlpha(floatValue);
                pd0Var.f48805f.setProgress(floatValue);
                FrameLayout frameLayout = pd0Var.f48810x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                pd0 pd0Var2 = this.f47789b;
                pd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var2.f48805f.setProgress(floatValue2);
                pd0Var2.d.setAlpha(floatValue2);
                pd0Var2.f48804e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = pd0Var2.f48810x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
