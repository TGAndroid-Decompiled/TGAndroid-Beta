package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nf0 extends AnimatorListenerAdapter {
    public final int f30903a;
    public final pf0 f30904b;

    public nf0(pf0 pf0Var, int i10) {
        this.f30903a = i10;
        this.f30904b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30903a) {
            case 0:
                this.f30904b.f31602s = null;
                return;
            default:
                this.f30904b.v = null;
                return;
        }
    }
}
