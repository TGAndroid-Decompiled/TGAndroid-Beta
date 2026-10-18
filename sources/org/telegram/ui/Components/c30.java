package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25079a;
    public final i30 f25080b;

    public c30(i30 i30Var, int i10) {
        this.f25079a = i10;
        this.f25080b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25079a) {
            case 0:
                i30 i30Var = this.f25080b;
                i30Var.f27053b.setVisibility(8);
                i30Var.f27063y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25080b.e.setVisibility(8);
                return;
        }
    }
}
