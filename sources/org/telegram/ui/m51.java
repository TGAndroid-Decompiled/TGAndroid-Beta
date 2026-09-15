package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35636a;
    public final g71 f35637b;
    public final boolean f35638c;

    public m51(g71 g71Var, boolean z10, int i10) {
        this.f35636a = i10;
        this.f35637b = g71Var;
        this.f35638c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35636a) {
            case 0:
                g71 g71Var = this.f35637b;
                d61 d61Var = g71Var.f33796h0;
                t51 t51Var = g71Var.f33798i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35638c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                d61Var.setAlpha(f7);
                d61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                t51Var.setAlpha(floatValue);
                t51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                g71Var.f33800j0.setAlpha(t51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f35638c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                g71 g71Var2 = this.f35637b;
                g71Var2.f33800j0.setAlpha(g71Var2.f33798i0.getAlpha() * floatValue2);
                return;
        }
    }
}
