package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class nc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28789a;
    public final zc0 f28790b;

    public nc0(zc0 zc0Var, int i10) {
        this.f28789a = i10;
        this.f28790b = zc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28789a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0 zc0Var = this.f28790b;
                org.telegram.ui.Cells.a5 a5Var = zc0Var.e;
                a5Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue));
                a5Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue));
                a5Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, floatValue));
                TextView textView = zc0Var.f33118x;
                textView.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, floatValue));
                zc0Var.f33116s.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, floatValue));
                return;
            default:
                zc0 zc0Var2 = this.f28790b;
                zc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var2.f33103a0 = floatValue2;
                zc0Var2.h(floatValue2);
                zc0Var2.setAlpha(zc0Var2.f33103a0);
                return;
        }
    }
}
