package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39201a;
    public final e2 f39202b;

    public b2(e2 e2Var, int i7) {
        this.f39201a = i7;
        this.f39202b = e2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39201a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var = this.f39202b;
                WindowManager.LayoutParams layoutParams = e2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.T3(e2Var.f39262c, e2Var.f39260a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var2 = this.f39202b;
                WindowManager.LayoutParams layoutParams2 = e2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.T3(e2Var2.f39262c, e2Var2.f39260a, layoutParams2);
                return;
        }
    }
}
