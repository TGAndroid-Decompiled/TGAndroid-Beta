package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28719a;
    public final xd0 f28720b;

    public ld0(xd0 xd0Var, int i10) {
        this.f28719a = i10;
        this.f28720b = xd0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28719a) {
            case 0:
                xd0 xd0Var = this.f28720b;
                xd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.M = floatValue;
                xd0Var.f(floatValue);
                xd0Var.setAlpha(xd0Var.M);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0 xd0Var2 = this.f28720b;
                eh.d dVar = xd0Var2.f33039e;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = xd0Var2.f33044w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                xd0Var2.f33043s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                return;
        }
    }
}
