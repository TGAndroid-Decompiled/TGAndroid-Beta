package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40607a;
    public final i2 f40608b;

    public f2(i2 i2Var, int i7) {
        this.f40607a = i7;
        this.f40608b = i2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40607a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var = this.f40608b;
                WindowManager.LayoutParams layoutParams = i2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.S3(i2Var.f40656c, i2Var.f40654a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var2 = this.f40608b;
                WindowManager.LayoutParams layoutParams2 = i2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.S3(i2Var2.f40656c, i2Var2.f40654a, layoutParams2);
                return;
        }
    }
}
