package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27814a;
    public final ng0 f27815b;

    public ig0(ng0 ng0Var, int i10) {
        this.f27814a = i10;
        this.f27815b = ng0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27814a) {
            case 0:
                this.f27815b.C = null;
                return;
            default:
                this.f27815b.u();
                return;
        }
    }
}
