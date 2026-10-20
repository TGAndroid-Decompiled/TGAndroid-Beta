package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class be0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24923a;
    public final me0 f24924b;

    public be0(me0 me0Var, int i10) {
        this.f24923a = i10;
        this.f24924b = me0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24923a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0 me0Var = this.f24924b;
                ci.i4 i4Var = me0Var.e;
                i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                i4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = me0Var.f28506w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                me0Var.f28505s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                return;
            default:
                me0 me0Var2 = this.f24924b;
                me0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0Var2.f28492a0 = floatValue2;
                me0Var2.h(floatValue2);
                me0Var2.setAlpha(me0Var2.f28492a0);
                return;
        }
    }
}
