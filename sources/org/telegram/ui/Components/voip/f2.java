package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40886a;
    public final i2 f40887b;

    public f2(i2 i2Var, int i7) {
        this.f40886a = i7;
        this.f40887b = i2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40886a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var = this.f40887b;
                WindowManager.LayoutParams layoutParams = i2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.R3(i2Var.f40935c, i2Var.f40933a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2 i2Var2 = this.f40887b;
                WindowManager.LayoutParams layoutParams2 = i2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.R3(i2Var2.f40935c, i2Var2.f40933a, layoutParams2);
                return;
        }
    }
}
