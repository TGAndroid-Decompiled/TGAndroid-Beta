package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c30 extends AnimatorListenerAdapter {
    public final int f25097a;
    public final i30 f25098b;

    public c30(i30 i30Var, int i10) {
        this.f25097a = i10;
        this.f25098b = i30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25097a) {
            case 0:
                i30 i30Var = this.f25098b;
                i30Var.f27107b.setVisibility(8);
                i30Var.f27117y = false;
                i30Var.E = 0.0f;
                return;
            default:
                this.f25098b.e.setVisibility(8);
                return;
        }
    }
}
