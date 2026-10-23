package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25210a;
    public final i30 f25211b;

    public c30(i30 i30Var, int i10) {
        this.f25210a = i10;
        this.f25211b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25210a) {
            case 0:
                i30 i30Var = this.f25211b;
                i30Var.f27188b.setVisibility(8);
                i30Var.f27198y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25211b.e.setVisibility(8);
                return;
        }
    }
}
