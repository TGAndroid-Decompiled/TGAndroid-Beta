package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29395a;
    public final m2 f29396b;

    public i2(m2 m2Var, int i10) {
        this.f29395a = i10;
        this.f29396b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29395a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var = this.f29396b;
                WindowManager.LayoutParams layoutParams = m2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(m2Var.f29496c, m2Var.f29494a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var2 = this.f29396b;
                WindowManager.LayoutParams layoutParams2 = m2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(m2Var2.f29496c, m2Var2.f29494a, layoutParams2);
                return;
        }
    }
}
