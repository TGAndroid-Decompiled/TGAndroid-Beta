package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26262a;
    public final wd0 f26263b;

    public kd0(wd0 wd0Var, int i10) {
        this.f26262a = i10;
        this.f26263b = wd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26262a) {
            case 0:
                wd0 wd0Var = this.f26263b;
                wd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd0Var.M = floatValue;
                wd0Var.f(floatValue);
                wd0Var.setAlpha(wd0Var.M);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd0 wd0Var2 = this.f26263b;
                dh.d dVar = wd0Var2.e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = wd0Var2.f30230w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                wd0Var2.f30229s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
