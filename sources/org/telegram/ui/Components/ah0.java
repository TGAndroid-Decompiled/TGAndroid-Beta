package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ah0 extends AnimatorListenerAdapter {
    public final int f24719a;
    public final dh0 f24720b;

    public ah0(dh0 dh0Var, int i10) {
        this.f24719a = i10;
        this.f24720b = dh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24719a) {
            case 0:
                this.f24720b.F = null;
                return;
            default:
                this.f24720b.u();
                return;
        }
    }
}
