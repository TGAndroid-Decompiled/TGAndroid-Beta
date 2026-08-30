package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29686a;
    public final m2 f29687b;

    public i2(m2 m2Var, int i10) {
        this.f29686a = i10;
        this.f29687b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29686a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var = this.f29687b;
                WindowManager.LayoutParams layoutParams = m2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(m2Var.f29774c, m2Var.f29772a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2 m2Var2 = this.f29687b;
                WindowManager.LayoutParams layoutParams2 = m2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(m2Var2.f29774c, m2Var2.f29772a, layoutParams2);
                return;
        }
    }
}
