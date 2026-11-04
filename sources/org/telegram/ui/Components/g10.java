package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g10 extends AnimatorListenerAdapter {
    public final int f33916a;
    public final l10 f33917b;

    public g10(l10 l10Var, int i3) {
        this.f33916a = i3;
        this.f33917b = l10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33916a) {
            case 0:
                l10 l10Var = this.f33917b;
                l10Var.f35549b.setVisibility(8);
                l10Var.E = false;
                l10Var.F = 0.0f;
                return;
            default:
                this.f33917b.f35554e.setVisibility(8);
                return;
        }
    }
}
