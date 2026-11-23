package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v10 extends AnimatorListenerAdapter {
    public final int f40535a;
    public final a20 f40536b;

    public v10(a20 a20Var, int i7) {
        this.f40535a = i7;
        this.f40536b = a20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40535a) {
            case 0:
                a20 a20Var = this.f40536b;
                a20Var.f33327b.setVisibility(8);
                a20Var.F = false;
                a20Var.G = 0.0f;
                return;
            default:
                this.f40536b.f33332e.setVisibility(8);
                return;
        }
    }
}
