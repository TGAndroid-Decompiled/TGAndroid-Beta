package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ag0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32159a;
    public final eg0 f32160b;

    public ag0(eg0 eg0Var, int i10) {
        this.f32159a = i10;
        this.f32160b = eg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32159a) {
            case 0:
                eg0 eg0Var = this.f32160b;
                eg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.d.setAlpha(floatValue);
                eg0Var.e.setAlpha(floatValue);
                eg0Var.f33399f.setProgress(floatValue);
                FrameLayout frameLayout = eg0Var.f33403w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                eg0 eg0Var2 = this.f32160b;
                eg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var2.f33399f.setProgress(floatValue2);
                eg0Var2.d.setAlpha(floatValue2);
                eg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = eg0Var2.f33403w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
