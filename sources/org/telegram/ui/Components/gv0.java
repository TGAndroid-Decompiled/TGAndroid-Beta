package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class gv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35074a;
    public final View f35075b;
    public final FrameLayout f35076c;

    public gv0(FrameLayout frameLayout, View view, int i7) {
        this.f35074a = i7;
        this.f35076c = frameLayout;
        this.f35075b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35074a) {
            case 0:
                hv0 hv0Var = (hv0) this.f35076c;
                hv0Var.f35353b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.invalidate();
                ((wk0) this.f35075b).invalidate();
                return;
            default:
                ((w61) this.f35076c).D(this.f35075b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
