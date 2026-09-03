package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29658a;
    public final m2 f29659b;

    public i2(m2 m2Var, int i10) {
        this.f29658a = i10;
        this.f29659b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29658a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var = this.f29659b;
                WindowManager.LayoutParams layoutParams = m2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(m2Var.f29746c, m2Var.f29744a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var2 = this.f29659b;
                WindowManager.LayoutParams layoutParams2 = m2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(m2Var2.f29746c, m2Var2.f29744a, layoutParams2);
                return;
        }
    }
}
