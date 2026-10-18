package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class be0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24956a;
    public final le0 f24957b;

    public be0(le0 le0Var, int i10) {
        this.f24956a = i10;
        this.f24957b = le0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24956a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0 le0Var = this.f24957b;
                ci.h4 h4Var = le0Var.e;
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = le0Var.f28219w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                le0Var.f28218s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                return;
            default:
                le0 le0Var2 = this.f24957b;
                le0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var2.f28205a0 = floatValue2;
                le0Var2.g(floatValue2);
                le0Var2.setAlpha(le0Var2.f28205a0);
                return;
        }
    }
}
