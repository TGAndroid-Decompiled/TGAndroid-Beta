package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24652a;
    public final sd0 f24653b;

    public hd0(sd0 sd0Var, int i10) {
        this.f24652a = i10;
        this.f24653b = sd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24652a) {
            case 0:
                sd0 sd0Var = this.f24653b;
                sd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue;
                sd0Var.f(floatValue);
                sd0Var.setAlpha(sd0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0 sd0Var2 = this.f24653b;
                ai.w5 w5Var = sd0Var2.e;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = sd0Var2.f27920w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                sd0Var2.f27919s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
