package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf0 extends AnimatorListenerAdapter {
    public final int f34707a;
    public final bg0 f34708b;

    public xf0(bg0 bg0Var, int i10) {
        this.f34707a = i10;
        this.f34708b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34707a) {
            case 0:
                this.f34708b.B = null;
                return;
            default:
                this.f34708b.u();
                return;
        }
    }
}
