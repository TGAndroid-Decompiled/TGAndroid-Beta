package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ud0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28798a;
    public final ee0 f28799b;

    public ud0(ee0 ee0Var, int i10) {
        this.f28798a = i10;
        this.f28799b = ee0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28798a) {
            case 0:
                ee0 ee0Var = this.f28799b;
                ee0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.P = floatValue;
                ee0Var.f(floatValue);
                ee0Var.setAlpha(ee0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0 ee0Var2 = this.f28799b;
                ai.w5 w5Var = ee0Var2.e;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = ee0Var2.f23999w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                ee0Var2.f23998s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
