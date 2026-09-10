package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28160a;
    public final l2 f28161b;

    public h2(l2 l2Var, int i10) {
        this.f28160a = i10;
        this.f28161b = l2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28160a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var = this.f28161b;
                WindowManager.LayoutParams layoutParams = l2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(l2Var.f28229c, l2Var.f28227a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var2 = this.f28161b;
                WindowManager.LayoutParams layoutParams2 = l2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(l2Var2.f28229c, l2Var2.f28227a, layoutParams2);
                return;
        }
    }
}
