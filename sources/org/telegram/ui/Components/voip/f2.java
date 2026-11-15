package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40610a;
    public final i2 f40611b;

    public f2(i2 i2Var, int i7) {
        this.f40610a = i7;
        this.f40611b = i2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40610a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var = this.f40611b;
                WindowManager.LayoutParams layoutParams = i2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.S3(i2Var.f40659c, i2Var.f40657a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var2 = this.f40611b;
                WindowManager.LayoutParams layoutParams2 = i2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.S3(i2Var2.f40659c, i2Var2.f40657a, layoutParams2);
                return;
        }
    }
}
