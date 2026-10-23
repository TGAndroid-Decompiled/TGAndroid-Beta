package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ee0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25961a;
    public final pe0 f25962b;

    public ee0(pe0 pe0Var, int i10) {
        this.f25961a = i10;
        this.f25962b = pe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25961a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe0 pe0Var = this.f25962b;
                ci.h4 h4Var = pe0Var.e;
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = pe0Var.f29540w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                pe0Var.f29539s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                return;
            default:
                pe0 pe0Var2 = this.f25962b;
                pe0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe0Var2.f29526a0 = floatValue2;
                pe0Var2.h(floatValue2);
                pe0Var2.setAlpha(pe0Var2.f29526a0);
                return;
        }
    }
}
