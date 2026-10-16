package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29858a;
    public final k2 f29859b;

    public g2(k2 k2Var, int i10) {
        this.f29858a = i10;
        this.f29859b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29858a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var = this.f29859b;
                WindowManager.LayoutParams layoutParams = k2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(k2Var.f29936c, k2Var.f29934a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.f29859b;
                WindowManager.LayoutParams layoutParams2 = k2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(k2Var2.f29936c, k2Var2.f29934a, layoutParams2);
                return;
        }
    }
}
