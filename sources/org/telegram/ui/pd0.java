package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class pd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48755a;
    public final sd0 f48756b;

    public pd0(sd0 sd0Var, int i7) {
        this.f48755a = i7;
        this.f48756b = sd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48755a) {
            case 0:
                sd0 sd0Var = this.f48756b;
                sd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.d.setAlpha(floatValue);
                sd0Var.f49836e.setAlpha(floatValue);
                sd0Var.f49837f.setProgress(floatValue);
                FrameLayout frameLayout = sd0Var.f49842x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                sd0 sd0Var2 = this.f48756b;
                sd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var2.f49837f.setProgress(floatValue2);
                sd0Var2.d.setAlpha(floatValue2);
                sd0Var2.f49836e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = sd0Var2.f49842x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
