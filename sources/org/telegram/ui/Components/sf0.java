package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sf0 extends AnimatorListenerAdapter {
    public final int f28830a;
    public final uf0 f28831b;

    public sf0(uf0 uf0Var, int i10) {
        this.f28830a = i10;
        this.f28831b = uf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28830a) {
            case 0:
                this.f28831b.f29372s = null;
                return;
            default:
                this.f28831b.v = null;
                return;
        }
    }
}
