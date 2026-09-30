package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ng0 extends AnimatorListenerAdapter {
    public final int f26760a;
    public final qg0 f26761b;

    public ng0(qg0 qg0Var, int i10) {
        this.f26760a = i10;
        this.f26761b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26760a) {
            case 0:
                this.f26761b.F = null;
                return;
            default:
                this.f26761b.u();
                return;
        }
    }
}
