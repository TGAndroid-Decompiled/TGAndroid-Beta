package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f27472a;
    public final r0 f27473b;

    public g0(r0 r0Var, int i7) {
        this.f27472a = i7;
        this.f27473b = r0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27472a) {
            case 0:
                r0 r0Var = this.f27473b;
                r0Var.f28442s.setVisibility(4);
                r0Var.f28447w = null;
                return;
            default:
                this.f27473b.f28447w = null;
                return;
        }
    }
}
