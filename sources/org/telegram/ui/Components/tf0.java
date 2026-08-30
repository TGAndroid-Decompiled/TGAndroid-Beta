package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tf0 extends AnimatorListenerAdapter {
    public final int f28972a;
    public final uf0 f28973b;

    public tf0(uf0 uf0Var, int i10) {
        this.f28972a = i10;
        this.f28973b = uf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28972a) {
            case 0:
                this.f28973b.f29212a.f29452n.setVisibility(8);
                return;
            default:
                this.f28973b.f29212a.h.setVisibility(8);
                return;
        }
    }
}
