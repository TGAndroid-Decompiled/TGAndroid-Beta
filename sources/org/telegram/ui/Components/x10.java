package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x10 extends AnimatorListenerAdapter {
    public final int f41944a;
    public final c20 f41945b;

    public x10(c20 c20Var, int i7) {
        this.f41944a = i7;
        this.f41945b = c20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41944a) {
            case 0:
                c20 c20Var = this.f41945b;
                c20Var.f33985b.setVisibility(8);
                c20Var.F = false;
                c20Var.G = 0.0f;
                return;
            default:
                this.f41945b.f33990e.setVisibility(8);
                return;
        }
    }
}
