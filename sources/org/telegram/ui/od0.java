package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class od0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48434a;
    public final rd0 f48435b;

    public od0(rd0 rd0Var, int i7) {
        this.f48434a = i7;
        this.f48435b = rd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48434a) {
            case 0:
                rd0 rd0Var = this.f48435b;
                rd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var.d.setAlpha(floatValue);
                rd0Var.f49462e.setAlpha(floatValue);
                rd0Var.f49463f.setProgress(floatValue);
                FrameLayout frameLayout = rd0Var.f49468x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                rd0 rd0Var2 = this.f48435b;
                rd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var2.f49463f.setProgress(floatValue2);
                rd0Var2.d.setAlpha(floatValue2);
                rd0Var2.f49462e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = rd0Var2.f49468x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
