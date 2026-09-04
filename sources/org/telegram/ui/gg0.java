package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36667a;
    public final kg0 f36668b;

    public gg0(kg0 kg0Var, int i10) {
        this.f36667a = i10;
        this.f36668b = kg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36667a) {
            case 0:
                kg0 kg0Var = this.f36668b;
                kg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var.d.setAlpha(floatValue);
                kg0Var.f38055e.setAlpha(floatValue);
                kg0Var.f38056f.setProgress(floatValue);
                FrameLayout frameLayout = kg0Var.f38060w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                kg0 kg0Var2 = this.f36668b;
                kg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var2.f38056f.setProgress(floatValue2);
                kg0Var2.d.setAlpha(floatValue2);
                kg0Var2.f38055e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = kg0Var2.f38060w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
