package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mg0 extends AnimatorListenerAdapter {
    public final int f26400a;
    public final pg0 f26401b;

    public mg0(pg0 pg0Var, int i10) {
        this.f26400a = i10;
        this.f26401b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26400a) {
            case 0:
                this.f26401b.F = null;
                return;
            default:
                this.f26401b.u();
                return;
        }
    }
}
