package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31574a;
    public final t1 f31575b;

    public p1(t1 t1Var, int i10) {
        this.f31574a = i10;
        this.f31575b = t1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31574a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1 t1Var = this.f31575b;
                WindowManager.LayoutParams layoutParams = t1Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.i0.S3(t1Var.f31668c, t1Var.f31666a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1 t1Var2 = this.f31575b;
                WindowManager.LayoutParams layoutParams2 = t1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.i0.S3(t1Var2.f31668c, t1Var2.f31666a, layoutParams2);
                return;
        }
    }
}
