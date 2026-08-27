package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

public final class h2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33606a;

    public final l2 f33607b;

    public h2(l2 l2Var, int i10) {
        this.f33606a = i10;
        this.f33607b = l2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33606a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var = this.f33607b;
                WindowManager.LayoutParams layoutParams = l2Var.d;
                layoutParams.x = (int) fFloatValue;
                AndroidUtilities.updateViewLayout(l2Var.f33704c, l2Var.f33702a, layoutParams);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2 l2Var2 = this.f33607b;
                WindowManager.LayoutParams layoutParams2 = l2Var2.d;
                layoutParams2.y = (int) fFloatValue2;
                AndroidUtilities.updateViewLayout(l2Var2.f33704c, l2Var2.f33702a, layoutParams2);
                break;
        }
    }
}
