package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41505a;
    public final tf0 f41506b;

    public pf0(tf0 tf0Var, int i9) {
        this.f41505a = i9;
        this.f41506b = tf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41505a) {
            case 0:
                tf0 tf0Var = this.f41506b;
                tf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var.d.setAlpha(floatValue);
                tf0Var.f42979e.setAlpha(floatValue);
                tf0Var.f42980f.setProgress(floatValue);
                FrameLayout frameLayout = tf0Var.f42984w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                tf0 tf0Var2 = this.f41506b;
                tf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var2.f42980f.setProgress(floatValue2);
                tf0Var2.d.setAlpha(floatValue2);
                tf0Var2.f42979e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = tf0Var2.f42984w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
