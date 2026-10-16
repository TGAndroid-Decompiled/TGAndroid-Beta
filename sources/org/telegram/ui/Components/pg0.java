package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pg0 extends AnimatorListenerAdapter {
    public final int f27996a;
    public final qg0 f27997b;

    public pg0(qg0 qg0Var, int i10) {
        this.f27996a = i10;
        this.f27997b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27996a) {
            case 0:
                this.f27997b.f28282a.f28527n.setVisibility(8);
                return;
            default:
                this.f27997b.f28282a.h.setVisibility(8);
                return;
        }
    }
}
