package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40991a;
    public final h2 f40992b;

    public e2(h2 h2Var, int i7) {
        this.f40991a = i7;
        this.f40992b = h2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40991a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2 h2Var = this.f40992b;
                WindowManager.LayoutParams layoutParams = h2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.R3(h2Var.f41041c, h2Var.f41039a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2 h2Var2 = this.f40992b;
                WindowManager.LayoutParams layoutParams2 = h2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.R3(h2Var2.f41041c, h2Var2.f41039a, layoutParams2);
                return;
        }
    }
}
