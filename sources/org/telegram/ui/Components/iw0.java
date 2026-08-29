package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iw0 extends AnimatorListenerAdapter {
    public final int f29490a;
    public final jw0 f29491b;

    public iw0(jw0 jw0Var, int i10) {
        this.f29490a = i10;
        this.f29491b = jw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29490a) {
            case 0:
                jw0 jw0Var = this.f29491b;
                jw0Var.f29839y = 1.0f;
                jw0Var.invalidate();
                jw0Var.C = null;
                return;
            case 1:
                jw0 jw0Var2 = this.f29491b;
                jw0Var2.m(((Float) jw0Var2.v.getAnimatedValue()).floatValue());
                jw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f29491b.B = null;
                return;
        }
    }
}
