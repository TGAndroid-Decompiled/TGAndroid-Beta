package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f26726a;
    public final pf0 f26727b;

    public of0(pf0 pf0Var, int i10) {
        this.f26726a = i10;
        this.f26727b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26726a) {
            case 0:
                this.f26727b.f27023a.f27285n.setVisibility(8);
                return;
            default:
                this.f26727b.f27023a.h.setVisibility(8);
                return;
        }
    }
}
