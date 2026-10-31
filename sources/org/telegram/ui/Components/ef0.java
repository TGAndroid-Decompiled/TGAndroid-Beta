package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25772a;
    public final jf0 f25773b;

    public ef0(jf0 jf0Var, int i10) {
        this.f25772a = i10;
        this.f25773b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25772a) {
            case 0:
                this.f25773b.F = null;
                return;
            default:
                this.f25773b.u();
                return;
        }
    }
}
