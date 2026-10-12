package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gh0 extends AnimatorListenerAdapter {
    public final int f26434a;
    public final jh0 f26435b;

    public gh0(jh0 jh0Var, int i10) {
        this.f26434a = i10;
        this.f26435b = jh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26434a) {
            case 0:
                this.f26435b.F = null;
                return;
            default:
                this.f26435b.u();
                return;
        }
    }
}
