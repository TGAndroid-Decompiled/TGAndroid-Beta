package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ae0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26489a;
    public final le0 f26490b;

    public ae0(le0 le0Var, int i10) {
        this.f26489a = i10;
        this.f26490b = le0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26489a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0 le0Var = this.f26490b;
                di.i4 i4Var = le0Var.e;
                i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                i4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = le0Var.f30198w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                le0Var.f30197s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                return;
            default:
                le0 le0Var2 = this.f26490b;
                le0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var2.f30184a0 = floatValue2;
                le0Var2.h(floatValue2);
                le0Var2.setAlpha(le0Var2.f30184a0);
                return;
        }
    }
}
