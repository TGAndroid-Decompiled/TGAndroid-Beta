package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30189a;
    public final k2 f30190b;

    public g2(k2 k2Var, int i10) {
        this.f30189a = i10;
        this.f30190b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30189a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var = this.f30190b;
                WindowManager.LayoutParams layoutParams = k2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(k2Var.f30267c, k2Var.f30265a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.f30190b;
                WindowManager.LayoutParams layoutParams2 = k2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(k2Var2.f30267c, k2Var2.f30265a, layoutParams2);
                return;
        }
    }
}
