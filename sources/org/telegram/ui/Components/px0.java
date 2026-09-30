package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class px0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27482a;
    public final View f27483b;
    public final FrameLayout f27484c;

    public px0(FrameLayout frameLayout, View view, int i10) {
        this.f27482a = i10;
        this.f27484c = frameLayout;
        this.f27483b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27482a) {
            case 0:
                qx0 qx0Var = (qx0) this.f27484c;
                qx0Var.f27744b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qx0Var.invalidate();
                ((xm0) this.f27483b).invalidate();
                return;
            default:
                ((y81) this.f27484c).E(this.f27483b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
