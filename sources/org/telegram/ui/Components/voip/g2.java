package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31497a;
    public final k2 f31498b;

    public g2(k2 k2Var, int i10) {
        this.f31497a = i10;
        this.f31498b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31497a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var = this.f31498b;
                WindowManager.LayoutParams layoutParams = k2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(k2Var.f31579c, k2Var.f31577a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.f31498b;
                WindowManager.LayoutParams layoutParams2 = k2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(k2Var2.f31579c, k2Var2.f31577a, layoutParams2);
                return;
        }
    }
}
