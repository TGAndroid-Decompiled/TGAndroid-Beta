package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f22777a;
    public final eg0 f22778b;

    public bg0(eg0 eg0Var, int i10) {
        this.f22777a = i10;
        this.f22778b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22777a) {
            case 0:
                this.f22778b.F = null;
                return;
            default:
                this.f22778b.u();
                return;
        }
    }
}
