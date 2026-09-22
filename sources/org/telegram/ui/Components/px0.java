package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class px0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27437a;
    public final View f27438b;
    public final FrameLayout f27439c;

    public px0(FrameLayout frameLayout, View view, int i10) {
        this.f27437a = i10;
        this.f27439c = frameLayout;
        this.f27438b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27437a) {
            case 0:
                qx0 qx0Var = (qx0) this.f27439c;
                qx0Var.f27688b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qx0Var.invalidate();
                ((wm0) this.f27438b).invalidate();
                return;
            default:
                ((z81) this.f27439c).F(this.f27438b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
