package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32048a;
    public final m2 f32049b;

    public i2(m2 m2Var, int i10) {
        this.f32048a = i10;
        this.f32049b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32048a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var = this.f32049b;
                WindowManager.LayoutParams layoutParams = m2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(m2Var.f32156c, m2Var.f32154a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var2 = this.f32049b;
                WindowManager.LayoutParams layoutParams2 = m2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(m2Var2.f32156c, m2Var2.f32154a, layoutParams2);
                return;
        }
    }
}
