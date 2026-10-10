package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ke0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28006a;
    public final ue0 f28007b;

    public ke0(ue0 ue0Var, int i10) {
        this.f28006a = i10;
        this.f28007b = ue0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28006a) {
            case 0:
                ue0 ue0Var = this.f28007b;
                ue0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue0Var.T = floatValue;
                ue0Var.g(floatValue);
                ue0Var.setAlpha(ue0Var.T);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue0 ue0Var2 = this.f28007b;
                ai.x5 x5Var = ue0Var2.f31478e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = ue0Var2.f31483w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                ue0Var2.f31482s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
