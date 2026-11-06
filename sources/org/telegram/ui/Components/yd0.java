package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f40615a;
    public final zd0 f40616b;

    public yd0(zd0 zd0Var, int i7) {
        this.f40615a = i7;
        this.f40616b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40615a) {
            case 0:
                this.f40616b.f40917a.f31792n.setVisibility(8);
                return;
            default:
                this.f40616b.f40917a.h.setVisibility(8);
                return;
        }
    }
}
