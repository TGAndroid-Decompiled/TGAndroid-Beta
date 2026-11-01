package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i81 extends AnimatorListenerAdapter {
    public final int f27027a;
    public final j81 f27028b;

    public i81(j81 j81Var, int i10) {
        this.f27027a = i10;
        this.f27028b = j81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27027a) {
            case 0:
                this.f27028b.D = null;
                return;
            default:
                this.f27028b.D = null;
                return;
        }
    }
}
