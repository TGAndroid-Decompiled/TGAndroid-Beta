package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33556a;
    public final l2 f33557b;

    public h2(l2 l2Var, int i9) {
        this.f33556a = i9;
        this.f33557b = l2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33556a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var = this.f33557b;
                WindowManager.LayoutParams layoutParams = l2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(l2Var.f33654c, l2Var.f33652a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var2 = this.f33557b;
                WindowManager.LayoutParams layoutParams2 = l2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(l2Var2.f33654c, l2Var2.f33652a, layoutParams2);
                return;
        }
    }
}
