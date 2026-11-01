package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31661a;
    public final u1 f31662b;

    public q1(u1 u1Var, int i10) {
        this.f31661a = i10;
        this.f31662b = u1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31661a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var = this.f31662b;
                WindowManager.LayoutParams layoutParams = u1Var.d;
                layoutParams.x = (int) floatValue;
                org.telegram.messenger.i0.S3(u1Var.f31748c, u1Var.f31746a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1 u1Var2 = this.f31662b;
                WindowManager.LayoutParams layoutParams2 = u1Var2.d;
                layoutParams2.y = (int) floatValue2;
                org.telegram.messenger.i0.S3(u1Var2.f31748c, u1Var2.f31746a, layoutParams2);
                return;
        }
    }
}
