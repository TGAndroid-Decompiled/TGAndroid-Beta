package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x10 extends AnimatorListenerAdapter {
    public final int f41945a;
    public final c20 f41946b;

    public x10(c20 c20Var, int i7) {
        this.f41945a = i7;
        this.f41946b = c20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41945a) {
            case 0:
                c20 c20Var = this.f41946b;
                c20Var.f33985b.setVisibility(8);
                c20Var.F = false;
                c20Var.G = 0.0f;
                return;
            default:
                this.f41946b.f33990e.setVisibility(8);
                return;
        }
    }
}
