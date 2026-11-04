package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class jd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46603a;
    public final md0 f46604b;

    public jd0(md0 md0Var, int i3) {
        this.f46603a = i3;
        this.f46604b = md0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46603a) {
            case 0:
                md0 md0Var = this.f46604b;
                md0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                md0Var.d.setAlpha(floatValue);
                md0Var.f47656e.setAlpha(floatValue);
                md0Var.f47657f.setProgress(floatValue);
                FrameLayout frameLayout = md0Var.f47662x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                md0 md0Var2 = this.f46604b;
                md0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                md0Var2.f47657f.setProgress(floatValue2);
                md0Var2.d.setAlpha(floatValue2);
                md0Var2.f47656e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = md0Var2.f47662x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
