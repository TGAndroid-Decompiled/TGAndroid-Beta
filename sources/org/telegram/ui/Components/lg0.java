package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f26084a;
    public final og0 f26085b;

    public lg0(og0 og0Var, int i10) {
        this.f26084a = i10;
        this.f26085b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26084a) {
            case 0:
                this.f26085b.F = null;
                return;
            default:
                this.f26085b.u();
                return;
        }
    }
}
