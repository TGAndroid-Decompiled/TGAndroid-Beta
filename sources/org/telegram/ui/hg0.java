package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38373a;
    public final lg0 f38374b;

    public hg0(lg0 lg0Var, int i10) {
        this.f38373a = i10;
        this.f38374b = lg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38373a) {
            case 0:
                lg0 lg0Var = this.f38374b;
                lg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var.d.setAlpha(floatValue);
                lg0Var.f39740e.setAlpha(floatValue);
                lg0Var.f39741f.setProgress(floatValue);
                FrameLayout frameLayout = lg0Var.f39745w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                lg0 lg0Var2 = this.f38374b;
                lg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var2.f39741f.setProgress(floatValue2);
                lg0Var2.d.setAlpha(floatValue2);
                lg0Var2.f39740e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = lg0Var2.f39745w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
