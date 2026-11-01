package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25806a;
    public final jf0 f25807b;

    public ef0(jf0 jf0Var, int i10) {
        this.f25806a = i10;
        this.f25807b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25806a) {
            case 0:
                this.f25807b.F = null;
                return;
            default:
                this.f25807b.u();
                return;
        }
    }
}
