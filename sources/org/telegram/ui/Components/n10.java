package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n10 extends AnimatorListenerAdapter {
    public final int f37429a;
    public final s10 f37430b;

    public n10(s10 s10Var, int i7) {
        this.f37429a = i7;
        this.f37430b = s10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37429a) {
            case 0:
                s10 s10Var = this.f37430b;
                s10Var.f39146b.setVisibility(8);
                s10Var.F = false;
                s10Var.G = 0.0f;
                return;
            default:
                this.f37430b.f39151e.setVisibility(8);
                return;
        }
    }
}
