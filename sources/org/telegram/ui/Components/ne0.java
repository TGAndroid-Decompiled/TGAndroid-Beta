package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ne0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28778a;
    public final xe0 f28779b;

    public ne0(xe0 xe0Var, int i10) {
        this.f28778a = i10;
        this.f28779b = xe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28778a) {
            case 0:
                xe0 xe0Var = this.f28779b;
                xe0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0Var.T = floatValue;
                xe0Var.g(floatValue);
                xe0Var.setAlpha(xe0Var.T);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe0 xe0Var2 = this.f28779b;
                ai.x5 x5Var = xe0Var2.f32735e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = xe0Var2.f32740w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                xe0Var2.f32739s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
