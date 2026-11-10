package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class fv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33648a;
    public final View f33649b;
    public final FrameLayout f33650c;

    public fv0(FrameLayout frameLayout, View view, int i7) {
        this.f33648a = i7;
        this.f33650c = frameLayout;
        this.f33649b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33648a) {
            case 0:
                gv0 gv0Var = (gv0) this.f33650c;
                gv0Var.f33983b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                ((rk0) this.f33649b).invalidate();
                return;
            default:
                ((v61) this.f33650c).F(this.f33649b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
