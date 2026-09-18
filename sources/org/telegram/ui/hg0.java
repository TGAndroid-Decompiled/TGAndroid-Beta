package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34155a;
    public final lg0 f34156b;

    public hg0(lg0 lg0Var, int i10) {
        this.f34155a = i10;
        this.f34156b = lg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34155a) {
            case 0:
                lg0 lg0Var = this.f34156b;
                lg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var.d.setAlpha(floatValue);
                lg0Var.e.setAlpha(floatValue);
                lg0Var.f35372f.setProgress(floatValue);
                FrameLayout frameLayout = lg0Var.f35376w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                lg0 lg0Var2 = this.f34156b;
                lg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var2.f35372f.setProgress(floatValue2);
                lg0Var2.d.setAlpha(floatValue2);
                lg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = lg0Var2.f35376w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
