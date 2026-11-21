package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40989a;
    public final h2 f40990b;

    public e2(h2 h2Var, int i7) {
        this.f40989a = i7;
        this.f40990b = h2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40989a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2 h2Var = this.f40990b;
                WindowManager.LayoutParams layoutParams = h2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.R3(h2Var.f41039c, h2Var.f41037a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2 h2Var2 = this.f40990b;
                WindowManager.LayoutParams layoutParams2 = h2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.R3(h2Var2.f41039c, h2Var2.f41037a, layoutParams2);
                return;
        }
    }
}
