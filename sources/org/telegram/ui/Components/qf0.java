package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf0 extends AnimatorListenerAdapter {
    public final int f29829a;
    public final uf0 f29830b;

    public qf0(uf0 uf0Var, int i10) {
        this.f29829a = i10;
        this.f29830b = uf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29829a) {
            case 0:
                this.f29830b.f31160x = null;
                return;
            default:
                this.f29830b.f31161y = null;
                return;
        }
    }
}
