package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class id0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38696a;
    public final vg0 f38697b;

    public id0(vg0 vg0Var, int i10) {
        this.f38696a = i10;
        this.f38697b = vg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38696a) {
            case 0:
                vg0 vg0Var = this.f38697b;
                vg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.f43049c.setAlpha(floatValue);
                vg0Var.f43049c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                vg0 vg0Var2 = this.f38697b;
                vg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                vg0Var2.V.setScaleX(f7);
                vg0Var2.V.setScaleY(f7);
                vg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                vg0 vg0Var3 = this.f38697b;
                vg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var3.f43049c.setAlpha(floatValue3);
                vg0Var3.f43049c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
