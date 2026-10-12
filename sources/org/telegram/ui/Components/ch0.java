package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch0 extends AnimatorListenerAdapter {
    public final int f24072a;
    public final fh0 f24073b;

    public ch0(fh0 fh0Var, int i10) {
        this.f24072a = i10;
        this.f24073b = fh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24072a) {
            case 0:
                this.f24073b.F = null;
                return;
            default:
                this.f24073b.u();
                return;
        }
    }
}
