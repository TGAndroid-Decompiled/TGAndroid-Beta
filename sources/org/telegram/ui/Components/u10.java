package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u10 extends AnimatorListenerAdapter {
    public final int f40166a;
    public final z10 f40167b;

    public u10(z10 z10Var, int i7) {
        this.f40166a = i7;
        this.f40167b = z10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40166a) {
            case 0:
                z10 z10Var = this.f40167b;
                z10Var.f42714b.setVisibility(8);
                z10Var.F = false;
                z10Var.G = 0.0f;
                return;
            default:
                this.f40167b.f42719e.setVisibility(8);
                return;
        }
    }
}
