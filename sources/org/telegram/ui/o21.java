package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o21 extends AnimatorListenerAdapter {
    public final int f40029a;
    public final q21 f40030b;

    public o21(q21 q21Var, int i10) {
        this.f40029a = i10;
        this.f40030b = q21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40029a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40030b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f40030b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                q21 q21Var = this.f40030b;
                q21Var.N = 0.0f;
                q21Var.I = null;
                q21Var.M = false;
                q21Var.d(true, false);
                return;
        }
    }
}
