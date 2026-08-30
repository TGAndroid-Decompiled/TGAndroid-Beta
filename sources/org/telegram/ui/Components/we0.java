package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we0 extends AnimatorListenerAdapter {
    public final int f30339a;
    public final ye0 f30340b;

    public we0(ye0 ye0Var, int i10) {
        this.f30339a = i10;
        this.f30340b = ye0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30339a) {
            case 0:
                this.f30340b.f31009s = null;
                return;
            default:
                this.f30340b.v = null;
                return;
        }
    }
}
