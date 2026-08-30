package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class bd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32941a;
    public final ng0 f32942b;

    public bd0(ng0 ng0Var, int i10) {
        this.f32941a = i10;
        this.f32942b = ng0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32941a) {
            case 0:
                ng0 ng0Var = this.f32942b;
                ng0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.f36626c.setAlpha(floatValue);
                ng0Var.f36626c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                ng0 ng0Var2 = this.f32942b;
                ng0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var2.f36626c.setAlpha(floatValue2);
                ng0Var2.f36626c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                ng0 ng0Var3 = this.f32942b;
                ng0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue3) + 0.1f;
                ng0Var3.S.setScaleX(f10);
                ng0Var3.S.setScaleY(f10);
                ng0Var3.S.setAlpha(floatValue3);
                return;
        }
    }
}
