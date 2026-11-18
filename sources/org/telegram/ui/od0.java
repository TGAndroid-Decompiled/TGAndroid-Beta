package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class od0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50534a;
    public final rd0 f50535b;

    public od0(rd0 rd0Var, int i7) {
        this.f50534a = i7;
        this.f50535b = rd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50534a) {
            case 0:
                rd0 rd0Var = this.f50535b;
                rd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var.d.setAlpha(floatValue);
                rd0Var.f51572e.setAlpha(floatValue);
                rd0Var.f51573f.setProgress(floatValue);
                FrameLayout frameLayout = rd0Var.f51578x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                rd0 rd0Var2 = this.f50535b;
                rd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var2.f51573f.setProgress(floatValue2);
                rd0Var2.d.setAlpha(floatValue2);
                rd0Var2.f51572e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = rd0Var2.f51578x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
