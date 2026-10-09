package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38013a;
    public final kg0 f38014b;

    public gg0(kg0 kg0Var, int i10) {
        this.f38013a = i10;
        this.f38014b = kg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38013a) {
            case 0:
                kg0 kg0Var = this.f38014b;
                kg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var.d.setAlpha(floatValue);
                kg0Var.f39280e.setAlpha(floatValue);
                kg0Var.f39281f.setProgress(floatValue);
                FrameLayout frameLayout = kg0Var.f39285w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                kg0 kg0Var2 = this.f38014b;
                kg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var2.f39281f.setProgress(floatValue2);
                kg0Var2.d.setAlpha(floatValue2);
                kg0Var2.f39280e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = kg0Var2.f39285w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
