package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class zx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33362a;
    public final View f33363b;
    public final FrameLayout f33364c;

    public zx0(FrameLayout frameLayout, View view, int i10) {
        this.f33362a = i10;
        this.f33364c = frameLayout;
        this.f33363b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33362a) {
            case 0:
                ay0 ay0Var = (ay0) this.f33364c;
                ay0Var.f24837b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ay0Var.invalidate();
                ((jn0) this.f33363b).invalidate();
                return;
            default:
                ((l91) this.f33364c).E(this.f33363b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
