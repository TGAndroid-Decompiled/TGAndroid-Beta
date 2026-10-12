package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gh0 extends AnimatorListenerAdapter {
    public final int f26432a;
    public final jh0 f26433b;

    public gh0(jh0 jh0Var, int i10) {
        this.f26432a = i10;
        this.f26433b = jh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26432a) {
            case 0:
                this.f26433b.F = null;
                return;
            default:
                this.f26433b.u();
                return;
        }
    }
}
