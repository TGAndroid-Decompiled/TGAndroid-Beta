package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ox0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27064a;
    public final View f27065b;
    public final FrameLayout f27066c;

    public ox0(FrameLayout frameLayout, View view, int i10) {
        this.f27064a = i10;
        this.f27066c = frameLayout;
        this.f27065b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27064a) {
            case 0:
                px0 px0Var = (px0) this.f27066c;
                px0Var.f27336b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                ((vm0) this.f27065b).invalidate();
                return;
            default:
                ((x81) this.f27066c).F(this.f27065b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
