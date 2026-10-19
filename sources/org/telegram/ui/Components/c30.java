package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25066a;
    public final i30 f25067b;

    public c30(i30 i30Var, int i10) {
        this.f25066a = i10;
        this.f25067b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25066a) {
            case 0:
                i30 i30Var = this.f25067b;
                i30Var.f27052b.setVisibility(8);
                i30Var.f27062y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25067b.e.setVisibility(8);
                return;
        }
    }
}
