package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sd0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28233a;
    public final ce0 f28234b;

    public sd0(ce0 ce0Var, int i10) {
        this.f28233a = i10;
        this.f28234b = ce0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28233a) {
            case 0:
                ce0 ce0Var = this.f28234b;
                ce0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.P = floatValue;
                ce0Var.f(floatValue);
                ce0Var.setAlpha(ce0Var.P);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0 ce0Var2 = this.f28234b;
                ai.w5 w5Var = ce0Var2.e;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = ce0Var2.f23328w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                ce0Var2.f23327s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
