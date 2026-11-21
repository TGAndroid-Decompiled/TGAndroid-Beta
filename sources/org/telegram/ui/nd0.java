package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class nd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50174a;
    public final qd0 f50175b;

    public nd0(qd0 qd0Var, int i7) {
        this.f50174a = i7;
        this.f50175b = qd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50174a) {
            case 0:
                qd0 qd0Var = this.f50175b;
                qd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd0Var.d.setAlpha(floatValue);
                qd0Var.f51258e.setAlpha(floatValue);
                qd0Var.f51259f.setProgress(floatValue);
                FrameLayout frameLayout = qd0Var.f51264x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                qd0 qd0Var2 = this.f50175b;
                qd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd0Var2.f51259f.setProgress(floatValue2);
                qd0Var2.d.setAlpha(floatValue2);
                qd0Var2.f51258e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = qd0Var2.f51264x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
