package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class nx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25613a;
    public final View f25614b;
    public final FrameLayout f25615c;

    public nx0(FrameLayout frameLayout, View view, int i10) {
        this.f25613a = i10;
        this.f25615c = frameLayout;
        this.f25614b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25613a) {
            case 0:
                ox0 ox0Var = (ox0) this.f25615c;
                ox0Var.f25930b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.invalidate();
                ((sm0) this.f25614b).invalidate();
                return;
            default:
                ((v81) this.f25615c).E(this.f25614b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
