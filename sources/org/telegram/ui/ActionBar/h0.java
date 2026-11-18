package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final int f28984a;
    public final r0 f28985b;

    public h0(r0 r0Var, int i7) {
        this.f28984a = i7;
        this.f28985b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28984a) {
            case 0:
                r0 r0Var = this.f28985b;
                r0Var.f29940s.setVisibility(4);
                r0Var.f29945w = null;
                return;
            default:
                this.f28985b.f29945w = null;
                return;
        }
    }
}
