package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k10 extends AnimatorListenerAdapter {
    public final int f35160a;
    public final p10 f35161b;

    public k10(p10 p10Var, int i7) {
        this.f35160a = i7;
        this.f35161b = p10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35160a) {
            case 0:
                p10 p10Var = this.f35161b;
                p10Var.f36766b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                return;
            default:
                this.f35161b.f36771e.setVisibility(8);
                return;
        }
    }
}
