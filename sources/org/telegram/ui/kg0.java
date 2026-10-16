package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class kg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37377a;
    public final og0 f37378b;

    public kg0(og0 og0Var, int i10) {
        this.f37377a = i10;
        this.f37378b = og0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37377a) {
            case 0:
                og0 og0Var = this.f37378b;
                og0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var.d.setAlpha(floatValue);
                og0Var.e.setAlpha(floatValue);
                og0Var.f38644f.setProgress(floatValue);
                FrameLayout frameLayout = og0Var.f38648w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                og0 og0Var2 = this.f37378b;
                og0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og0Var2.f38644f.setProgress(floatValue2);
                og0Var2.d.setAlpha(floatValue2);
                og0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = og0Var2.f38648w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
