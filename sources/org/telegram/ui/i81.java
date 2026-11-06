package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i81 extends AnimatorListenerAdapter {
    public final int f46591a;
    public final m81 f46592b;

    public i81(m81 m81Var, int i7) {
        this.f46591a = i7;
        this.f46592b = m81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46591a) {
            case 0:
                m81 m81Var = this.f46592b;
                m81Var.f47707w = 0;
                m81Var.f47704n.setVisibility(8);
                return;
            case 1:
                this.f46592b.f47707w = 0;
                return;
            default:
                this.f46592b.F.setVisibility(8);
                return;
        }
    }
}
