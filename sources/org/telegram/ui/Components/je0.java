package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class je0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27705a;
    public final te0 f27706b;

    public je0(te0 te0Var, int i10) {
        this.f27705a = i10;
        this.f27706b = te0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27705a) {
            case 0:
                te0 te0Var = this.f27706b;
                te0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te0Var.T = floatValue;
                te0Var.g(floatValue);
                te0Var.setAlpha(te0Var.T);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te0 te0Var2 = this.f27706b;
                ai.x5 x5Var = te0Var2.f31165e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = te0Var2.f31170w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                te0Var2.f31169s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
