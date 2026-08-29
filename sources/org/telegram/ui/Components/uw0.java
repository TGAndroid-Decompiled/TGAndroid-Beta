package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class uw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33328a;
    public final View f33329b;
    public final FrameLayout f33330c;

    public uw0(FrameLayout frameLayout, View view, int i10) {
        this.f33328a = i10;
        this.f33330c = frameLayout;
        this.f33329b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33328a) {
            case 0:
                vw0 vw0Var = (vw0) this.f33330c;
                vw0Var.f34195b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vw0Var.invalidate();
                ((fm0) this.f33329b).invalidate();
                return;
            default:
                ((z71) this.f33330c).E(this.f33329b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
