package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class nf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39578a;
    public final rf0 f39579b;

    public nf0(rf0 rf0Var, int i10) {
        this.f39578a = i10;
        this.f39579b = rf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39578a) {
            case 0:
                rf0 rf0Var = this.f39579b;
                rf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var.d.setAlpha(floatValue);
                rf0Var.e.setAlpha(floatValue);
                rf0Var.f41198f.setProgress(floatValue);
                FrameLayout frameLayout = rf0Var.f41202w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                rf0 rf0Var2 = this.f39579b;
                rf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var2.f41198f.setProgress(floatValue2);
                rf0Var2.d.setAlpha(floatValue2);
                rf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = rf0Var2.f41202w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
