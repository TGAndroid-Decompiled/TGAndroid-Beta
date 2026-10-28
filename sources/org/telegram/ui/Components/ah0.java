package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ah0 extends AnimatorListenerAdapter {
    public final int f26556a;
    public final dh0 f26557b;

    public ah0(dh0 dh0Var, int i10) {
        this.f26556a = i10;
        this.f26557b = dh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26556a) {
            case 0:
                this.f26557b.F = null;
                return;
            default:
                this.f26557b.u();
                return;
        }
    }
}
