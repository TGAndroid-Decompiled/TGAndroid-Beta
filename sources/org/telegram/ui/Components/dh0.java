package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dh0 extends AnimatorListenerAdapter {
    public final int f25707a;
    public final gh0 f25708b;

    public dh0(gh0 gh0Var, int i10) {
        this.f25707a = i10;
        this.f25708b = gh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25707a) {
            case 0:
                this.f25708b.F = null;
                return;
            default:
                this.f25708b.u();
                return;
        }
    }
}
