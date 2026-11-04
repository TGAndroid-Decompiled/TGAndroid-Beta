package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33197a;
    public final View f33198b;
    public final FrameLayout f33199c;

    public dv0(FrameLayout frameLayout, View view, int i3) {
        this.f33197a = i3;
        this.f33199c = frameLayout;
        this.f33198b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33197a) {
            case 0:
                ev0 ev0Var = (ev0) this.f33199c;
                ev0Var.f33469b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ev0Var.invalidate();
                ((vk0) this.f33198b).invalidate();
                return;
            default:
                ((n61) this.f33199c).E(this.f33198b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
