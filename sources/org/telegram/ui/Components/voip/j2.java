package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29353a;
    public final n2 f29354b;

    public j2(n2 n2Var, int i10) {
        this.f29353a = i10;
        this.f29354b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29353a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var = this.f29354b;
                WindowManager.LayoutParams layoutParams = n2Var.d;
                layoutParams.x = (int) floatValue;
                AndroidUtilities.updateViewLayout(n2Var.f29449c, n2Var.f29447a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2 n2Var2 = this.f29354b;
                WindowManager.LayoutParams layoutParams2 = n2Var2.d;
                layoutParams2.y = (int) floatValue2;
                AndroidUtilities.updateViewLayout(n2Var2.f29449c, n2Var2.f29447a, layoutParams2);
                return;
        }
    }
}
