package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class dg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32965a;
    public final hg0 f32966b;

    public dg0(hg0 hg0Var, int i10) {
        this.f32965a = i10;
        this.f32966b = hg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32965a) {
            case 0:
                hg0 hg0Var = this.f32966b;
                hg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.d.setAlpha(floatValue);
                hg0Var.e.setAlpha(floatValue);
                hg0Var.f34220f.setProgress(floatValue);
                FrameLayout frameLayout = hg0Var.f34224w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                hg0 hg0Var2 = this.f32966b;
                hg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.f34220f.setProgress(floatValue2);
                hg0Var2.d.setAlpha(floatValue2);
                hg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = hg0Var2.f34224w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
