package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ng0 extends AnimatorListenerAdapter {
    public final int f26761a;
    public final qg0 f26762b;

    public ng0(qg0 qg0Var, int i10) {
        this.f26761a = i10;
        this.f26762b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26761a) {
            case 0:
                this.f26762b.F = null;
                return;
            default:
                this.f26762b.u();
                return;
        }
    }
}
