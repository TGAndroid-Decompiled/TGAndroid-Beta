package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39121a;
    public final e2 f39122b;

    public b2(e2 e2Var, int i7) {
        this.f39121a = i7;
        this.f39122b = e2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39121a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var = this.f39122b;
                WindowManager.LayoutParams layoutParams = e2Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.g0.T3(e2Var.f39182c, e2Var.f39180a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2 e2Var2 = this.f39122b;
                WindowManager.LayoutParams layoutParams2 = e2Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.g0.T3(e2Var2.f39182c, e2Var2.f39180a, layoutParams2);
                return;
        }
    }
}
