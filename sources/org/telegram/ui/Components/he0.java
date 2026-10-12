package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class he0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25656a;
    public final re0 f25657b;

    public he0(re0 re0Var, int i10) {
        this.f25656a = i10;
        this.f25657b = re0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25656a) {
            case 0:
                re0 re0Var = this.f25657b;
                re0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var.T = floatValue;
                re0Var.g(floatValue);
                re0Var.setAlpha(re0Var.T);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0 re0Var2 = this.f25657b;
                bi.i5 i5Var = re0Var2.e;
                i5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                i5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                i5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = re0Var2.f28822w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                re0Var2.f28821s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
