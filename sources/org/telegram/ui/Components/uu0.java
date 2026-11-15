package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uu0 extends AnimatorListenerAdapter {
    public final int f40165a;
    public final vu0 f40166b;

    public uu0(vu0 vu0Var, int i7) {
        this.f40165a = i7;
        this.f40166b = vu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40165a) {
            case 0:
                vu0 vu0Var = this.f40166b;
                vu0Var.E = 1.0f;
                vu0Var.invalidate();
                vu0Var.H = null;
                return;
            case 1:
                vu0 vu0Var2 = this.f40166b;
                vu0Var2.m(((Float) vu0Var2.f41157w.getAnimatedValue()).floatValue());
                vu0Var2.f41157w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f40166b.G = null;
                return;
        }
    }
}
