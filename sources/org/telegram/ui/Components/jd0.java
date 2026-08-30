package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25961a;
    public final vd0 f25962b;

    public jd0(vd0 vd0Var, int i10) {
        this.f25961a = i10;
        this.f25962b = vd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25961a) {
            case 0:
                vd0 vd0Var = this.f25962b;
                vd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd0Var.M = floatValue;
                vd0Var.f(floatValue);
                vd0Var.setAlpha(vd0Var.M);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd0 vd0Var2 = this.f25962b;
                dh.d dVar = vd0Var2.e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = vd0Var2.f29440w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                vd0Var2.f29439s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
