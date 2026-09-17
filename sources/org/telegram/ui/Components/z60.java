package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z60 extends AnimatorListenerAdapter {
    public final int f33115a;
    public final a70 f33116b;

    public z60(a70 a70Var, int i10) {
        this.f33115a = i10;
        this.f33116b = a70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33115a) {
            case 0:
                a70 a70Var = this.f33116b;
                a70Var.f24327e.f24598d0 = null;
                a70Var.requestLayout();
                return;
            default:
                a70 a70Var2 = this.f33116b;
                a70Var2.f24327e.f24598d0 = null;
                a70Var2.f24324a = false;
                return;
        }
    }
}
