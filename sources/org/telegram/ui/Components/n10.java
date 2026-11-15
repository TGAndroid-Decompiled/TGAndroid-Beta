package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n10 extends AnimatorListenerAdapter {
    public final int f37428a;
    public final s10 f37429b;

    public n10(s10 s10Var, int i7) {
        this.f37428a = i7;
        this.f37429b = s10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37428a) {
            case 0:
                s10 s10Var = this.f37429b;
                s10Var.f39143b.setVisibility(8);
                s10Var.F = false;
                s10Var.G = 0.0f;
                return;
            default:
                this.f37429b.f39148e.setVisibility(8);
                return;
        }
    }
}
