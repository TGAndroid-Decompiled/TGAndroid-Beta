package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class eg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36018a;
    public final ig0 f36019b;

    public eg0(ig0 ig0Var, int i10) {
        this.f36018a = i10;
        this.f36019b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36018a) {
            case 0:
                ig0 ig0Var = this.f36019b;
                ig0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.d.setAlpha(floatValue);
                ig0Var.f37421e.setAlpha(floatValue);
                ig0Var.f37422f.setProgress(floatValue);
                FrameLayout frameLayout = ig0Var.f37426w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                ig0 ig0Var2 = this.f36019b;
                ig0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.f37422f.setProgress(floatValue2);
                ig0Var2.d.setAlpha(floatValue2);
                ig0Var2.f37421e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = ig0Var2.f37426w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
