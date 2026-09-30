package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29104a;
    public final fe0 f29105b;

    public vd0(fe0 fe0Var, int i10) {
        this.f29104a = i10;
        this.f29105b = fe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29104a) {
            case 0:
                fe0 fe0Var = this.f29105b;
                fe0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var.P = floatValue;
                fe0Var.f(floatValue);
                fe0Var.setAlpha(fe0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0 fe0Var2 = this.f29105b;
                ai.w5 w5Var = fe0Var2.e;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = fe0Var2.f24286w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                fe0Var2.f24285s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
