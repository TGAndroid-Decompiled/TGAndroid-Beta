package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i81 extends AnimatorListenerAdapter {
    public final int f46599a;
    public final m81 f46600b;

    public i81(m81 m81Var, int i7) {
        this.f46599a = i7;
        this.f46600b = m81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46599a) {
            case 0:
                m81 m81Var = this.f46600b;
                m81Var.f47733w = 0;
                m81Var.f47730n.setVisibility(8);
                return;
            case 1:
                this.f46600b.f47733w = 0;
                return;
            default:
                this.f46600b.F.setVisibility(8);
                return;
        }
    }
}
