package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31927a;
    public final n2 f31928b;

    public j2(n2 n2Var, int i10) {
        this.f31927a = i10;
        this.f31928b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31927a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var = this.f31928b;
                WindowManager.LayoutParams layoutParams = n2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(n2Var.f32029c, n2Var.f32027a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var2 = this.f31928b;
                WindowManager.LayoutParams layoutParams2 = n2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(n2Var2.f32029c, n2Var2.f32027a, layoutParams2);
                return;
        }
    }
}
