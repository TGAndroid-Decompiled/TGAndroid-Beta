package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class md0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50040a;
    public final pd0 f50041b;

    public md0(pd0 pd0Var, int i7) {
        this.f50040a = i7;
        this.f50041b = pd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50040a) {
            case 0:
                pd0 pd0Var = this.f50041b;
                pd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var.d.setAlpha(floatValue);
                pd0Var.f50998e.setAlpha(floatValue);
                pd0Var.f50999f.setProgress(floatValue);
                FrameLayout frameLayout = pd0Var.f51004x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                pd0 pd0Var2 = this.f50041b;
                pd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var2.f50999f.setProgress(floatValue2);
                pd0Var2.d.setAlpha(floatValue2);
                pd0Var2.f50998e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = pd0Var2.f51004x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
