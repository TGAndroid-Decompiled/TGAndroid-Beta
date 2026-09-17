package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f24696a;
    public final eg0 f24697b;

    public bg0(eg0 eg0Var, int i10) {
        this.f24696a = i10;
        this.f24697b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24696a) {
            case 0:
                this.f24697b.F = null;
                return;
            default:
                this.f24697b.u();
                return;
        }
    }
}
