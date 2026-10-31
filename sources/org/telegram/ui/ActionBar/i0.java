package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f20387a;
    public final t0 f20388b;

    public i0(t0 t0Var, int i10) {
        this.f20387a = i10;
        this.f20388b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20387a) {
            case 0:
                t0 t0Var = this.f20388b;
                t0Var.f20847s.setVisibility(4);
                t0Var.f20852w = null;
                return;
            default:
                this.f20388b.f20852w = null;
                return;
        }
    }
}
