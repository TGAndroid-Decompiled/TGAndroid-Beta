package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31358a;
    public final yc0 f31359b;

    public oc0(yc0 yc0Var, int i9) {
        this.f31358a = i9;
        this.f31359b = yc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31358a) {
            case 0:
                yc0 yc0Var = this.f31359b;
                yc0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0Var.L = floatValue;
                yc0Var.f(floatValue);
                yc0Var.setAlpha(yc0Var.L);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0 yc0Var2 = this.f31359b;
                dh.g gVar = yc0Var2.f34943e;
                gVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                gVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                gVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = yc0Var2.f34948w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                yc0Var2.f34947s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
