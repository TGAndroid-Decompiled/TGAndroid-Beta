package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k10 extends AnimatorListenerAdapter {
    public final int f35208a;
    public final q10 f35209b;

    public k10(q10 q10Var, int i7) {
        this.f35208a = i7;
        this.f35209b = q10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35208a) {
            case 0:
                q10 q10Var = this.f35209b;
                q10Var.f37166b.setVisibility(8);
                q10Var.E = false;
                q10Var.F = 0.0f;
                return;
            default:
                this.f35209b.f37171e.setVisibility(8);
                return;
        }
    }
}
