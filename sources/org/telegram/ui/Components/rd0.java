package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26655a;
    public final be0 f26656b;

    public rd0(be0 be0Var, int i10) {
        this.f26655a = i10;
        this.f26656b = be0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26655a) {
            case 0:
                be0 be0Var = this.f26656b;
                be0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.P = floatValue;
                be0Var.f(floatValue);
                be0Var.setAlpha(be0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0 be0Var2 = this.f26656b;
                bi.l4 l4Var = be0Var2.e;
                l4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                l4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                l4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = be0Var2.f21815w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                be0Var2.f21814s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
