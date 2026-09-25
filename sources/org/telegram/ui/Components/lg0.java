package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f26092a;
    public final og0 f26093b;

    public lg0(og0 og0Var, int i10) {
        this.f26092a = i10;
        this.f26093b = og0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26092a) {
            case 0:
                this.f26093b.F = null;
                return;
            default:
                this.f26093b.u();
                return;
        }
    }
}
