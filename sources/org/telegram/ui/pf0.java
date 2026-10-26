package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42493a;
    public final tf0 f42494b;

    public pf0(tf0 tf0Var, int i10) {
        this.f42493a = i10;
        this.f42494b = tf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42493a) {
            case 0:
                tf0 tf0Var = this.f42494b;
                tf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var.d.setAlpha(floatValue);
                tf0Var.e.setAlpha(floatValue);
                tf0Var.f43825f.setProgress(floatValue);
                FrameLayout frameLayout = tf0Var.f43829w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                tf0 tf0Var2 = this.f42494b;
                tf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var2.f43825f.setProgress(floatValue2);
                tf0Var2.d.setAlpha(floatValue2);
                tf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = tf0Var2.f43829w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
