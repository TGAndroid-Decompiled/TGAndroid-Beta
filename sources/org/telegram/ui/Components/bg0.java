package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f22738a;
    public final eg0 f22739b;

    public bg0(eg0 eg0Var, int i10) {
        this.f22738a = i10;
        this.f22739b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22738a) {
            case 0:
                this.f22739b.F = null;
                return;
            default:
                this.f22739b.u();
                return;
        }
    }
}
