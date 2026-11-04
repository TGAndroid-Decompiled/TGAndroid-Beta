package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39539a;
    public final u1 f39540b;

    public q1(u1 u1Var, int i3) {
        this.f39539a = i3;
        this.f39540b = u1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39539a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var = this.f39540b;
                WindowManager.LayoutParams layoutParams = u1Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.T3(u1Var.f39623c, u1Var.f39621a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var2 = this.f39540b;
                WindowManager.LayoutParams layoutParams2 = u1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.T3(u1Var2.f39623c, u1Var2.f39621a, layoutParams2);
                return;
        }
    }
}
