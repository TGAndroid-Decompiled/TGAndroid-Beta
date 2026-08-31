package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27781a;
    public final ng0 f27782b;

    public ig0(ng0 ng0Var, int i10) {
        this.f27781a = i10;
        this.f27782b = ng0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27781a) {
            case 0:
                this.f27782b.C = null;
                return;
            default:
                this.f27782b.u();
                return;
        }
    }
}
