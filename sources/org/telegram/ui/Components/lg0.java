package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f26127a;
    public final og0 f26128b;

    public lg0(og0 og0Var, int i10) {
        this.f26127a = i10;
        this.f26128b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26127a) {
            case 0:
                this.f26128b.F = null;
                return;
            default:
                this.f26128b.u();
                return;
        }
    }
}
