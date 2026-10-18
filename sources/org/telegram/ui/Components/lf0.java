package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf0 extends AnimatorListenerAdapter {
    public final int f28230a;
    public final nf0 f28231b;

    public lf0(nf0 nf0Var, int i10) {
        this.f28230a = i10;
        this.f28231b = nf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28230a) {
            case 0:
                this.f28231b.f28759s = null;
                return;
            default:
                this.f28231b.v = null;
                return;
        }
    }
}
