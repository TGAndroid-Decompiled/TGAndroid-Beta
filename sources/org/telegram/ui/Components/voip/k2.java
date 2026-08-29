package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33787a;
    public final o2 f33788b;

    public k2(o2 o2Var, int i10) {
        this.f33787a = i10;
        this.f33788b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33787a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2 o2Var = this.f33788b;
                WindowManager.LayoutParams layoutParams = o2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(o2Var.f33896c, o2Var.f33894a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2 o2Var2 = this.f33788b;
                WindowManager.LayoutParams layoutParams2 = o2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(o2Var2.f33896c, o2Var2.f33894a, layoutParams2);
                return;
        }
    }
}
