package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i81 extends AnimatorListenerAdapter {
    public final int f46600a;
    public final m81 f46601b;

    public i81(m81 m81Var, int i7) {
        this.f46600a = i7;
        this.f46601b = m81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46600a) {
            case 0:
                m81 m81Var = this.f46601b;
                m81Var.f47734w = 0;
                m81Var.f47731n.setVisibility(8);
                return;
            case 1:
                this.f46601b.f47734w = 0;
                return;
            default:
                this.f46601b.F.setVisibility(8);
                return;
        }
    }
}
