package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ru0 extends AnimatorListenerAdapter {
    public final int f37808a;
    public final su0 f37809b;

    public ru0(su0 su0Var, int i3) {
        this.f37808a = i3;
        this.f37809b = su0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37808a) {
            case 0:
                su0 su0Var = this.f37809b;
                su0Var.E = 1.0f;
                su0Var.invalidate();
                su0Var.H = null;
                return;
            case 1:
                su0 su0Var2 = this.f37809b;
                su0Var2.m(((Float) su0Var2.f38121w.getAnimatedValue()).floatValue());
                su0Var2.f38121w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f37809b.G = null;
                return;
        }
    }
}
