package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class mf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39259a;
    public final qf0 f39260b;

    public mf0(qf0 qf0Var, int i10) {
        this.f39259a = i10;
        this.f39260b = qf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39259a) {
            case 0:
                qf0 qf0Var = this.f39260b;
                qf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf0Var.d.setAlpha(floatValue);
                qf0Var.e.setAlpha(floatValue);
                qf0Var.f40563f.setProgress(floatValue);
                FrameLayout frameLayout = qf0Var.f40567w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                qf0 qf0Var2 = this.f39260b;
                qf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf0Var2.f40563f.setProgress(floatValue2);
                qf0Var2.d.setAlpha(floatValue2);
                qf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = qf0Var2.f40567w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
