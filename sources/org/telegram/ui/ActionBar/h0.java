package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final int f28982a;
    public final r0 f28983b;

    public h0(r0 r0Var, int i7) {
        this.f28982a = i7;
        this.f28983b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28982a) {
            case 0:
                r0 r0Var = this.f28983b;
                r0Var.f29938s.setVisibility(4);
                r0Var.f29943w = null;
                return;
            default:
                this.f28983b.f29943w = null;
                return;
        }
    }
}
