package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35551a;
    public final q10 f35552b;

    public l10(q10 q10Var, int i7) {
        this.f35551a = i7;
        this.f35552b = q10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35551a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q10 q10Var = this.f35552b;
                q10Var.f37175s.x = (int) floatValue;
                q10Var.i();
                n10 n10Var = q10Var.f37164a;
                if (n10Var.getParent() != null) {
                    q10Var.f37173n.updateViewLayout(n10Var, q10Var.f37175s);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q10 q10Var2 = this.f35552b;
                q10Var2.f37175s.y = (int) floatValue2;
                n10 n10Var2 = q10Var2.f37164a;
                if (n10Var2.getParent() != null) {
                    q10Var2.f37173n.updateViewLayout(n10Var2, q10Var2.f37175s);
                    return;
                }
                return;
        }
    }
}
