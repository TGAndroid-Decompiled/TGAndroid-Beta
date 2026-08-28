package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf0 extends AnimatorListenerAdapter {
    public final int f30429a;
    public final pf0 f30430b;

    public lf0(pf0 pf0Var, int i9) {
        this.f30429a = i9;
        this.f30430b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30429a) {
            case 0:
                this.f30430b.B = null;
                return;
            default:
                this.f30430b.u();
                return;
        }
    }
}
