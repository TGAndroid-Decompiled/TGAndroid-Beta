package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf0 extends AnimatorListenerAdapter {
    public final int f27023a;
    public final lf0 f27024b;

    public hf0(lf0 lf0Var, int i10) {
        this.f27023a = i10;
        this.f27024b = lf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27023a) {
            case 0:
                this.f27024b.f28332x = null;
                return;
            default:
                this.f27024b.f28333y = null;
                return;
        }
    }
}
