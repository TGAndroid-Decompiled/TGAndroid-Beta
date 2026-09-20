package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27564a;
    public final ae0 f27565b;

    public qd0(ae0 ae0Var, int i10) {
        this.f27564a = i10;
        this.f27565b = ae0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27564a) {
            case 0:
                ae0 ae0Var = this.f27565b;
                ae0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae0Var.P = floatValue;
                ae0Var.f(floatValue);
                ae0Var.setAlpha(ae0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae0 ae0Var2 = this.f27565b;
                ai.x5 x5Var = ae0Var2.e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = ae0Var2.f22663w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                ae0Var2.f22662s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
