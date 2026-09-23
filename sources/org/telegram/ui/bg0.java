package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class bg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32109a;
    public final fg0 f32110b;

    public bg0(fg0 fg0Var, int i10) {
        this.f32109a = i10;
        this.f32110b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32109a) {
            case 0:
                fg0 fg0Var = this.f32110b;
                fg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.d.setAlpha(floatValue);
                fg0Var.e.setAlpha(floatValue);
                fg0Var.f33315f.setProgress(floatValue);
                FrameLayout frameLayout = fg0Var.f33319w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                fg0 fg0Var2 = this.f32110b;
                fg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.f33315f.setProgress(floatValue2);
                fg0Var2.d.setAlpha(floatValue2);
                fg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = fg0Var2.f33319w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
