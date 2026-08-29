package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41403a;
    public final tf0 f41404b;

    public pf0(tf0 tf0Var, int i10) {
        this.f41403a = i10;
        this.f41404b = tf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41403a) {
            case 0:
                tf0 tf0Var = this.f41404b;
                tf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var.d.setAlpha(floatValue);
                tf0Var.f42693e.setAlpha(floatValue);
                tf0Var.f42694f.setProgress(floatValue);
                FrameLayout frameLayout = tf0Var.f42698w;
                frameLayout.setAlpha(floatValue);
                float f9 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f9);
                frameLayout.setScaleY(f9);
                return;
            default:
                tf0 tf0Var2 = this.f41404b;
                tf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var2.f42694f.setProgress(floatValue2);
                tf0Var2.d.setAlpha(floatValue2);
                tf0Var2.f42693e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = tf0Var2.f42698w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
