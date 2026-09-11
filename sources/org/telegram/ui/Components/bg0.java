package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24695a;
    public final eg0 f24696b;

    public bg0(eg0 eg0Var, int i10) {
        this.f24695a = i10;
        this.f24696b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24695a) {
            case 0:
                this.f24696b.F = null;
                return;
            default:
                this.f24696b.u();
                return;
        }
    }
}
