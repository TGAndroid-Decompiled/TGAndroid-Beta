package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mg0 extends AnimatorListenerAdapter {
    public final int f26405a;
    public final pg0 f26406b;

    public mg0(pg0 pg0Var, int i10) {
        this.f26405a = i10;
        this.f26406b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26405a) {
            case 0:
                this.f26406b.F = null;
                return;
            default:
                this.f26406b.u();
                return;
        }
    }
}
