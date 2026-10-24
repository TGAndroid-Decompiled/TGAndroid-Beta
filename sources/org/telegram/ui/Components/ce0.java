package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ce0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25297a;
    public final ne0 f25298b;

    public ce0(ne0 ne0Var, int i10) {
        this.f25297a = i10;
        this.f25298b = ne0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25297a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ne0 ne0Var = this.f25298b;
                ci.h4 h4Var = ne0Var.e;
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = ne0Var.f28896w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                ne0Var.f28895s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                return;
            default:
                ne0 ne0Var2 = this.f25298b;
                ne0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ne0Var2.f28882a0 = floatValue2;
                ne0Var2.h(floatValue2);
                ne0Var2.setAlpha(ne0Var2.f28882a0);
                return;
        }
    }
}
