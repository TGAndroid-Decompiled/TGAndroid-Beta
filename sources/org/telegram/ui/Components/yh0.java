package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yh0 extends AnimatorListenerAdapter {
    public final int f40723a;
    public final li0 f40724b;

    public yh0(li0 li0Var, int i3) {
        this.f40723a = i3;
        this.f40724b = li0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40723a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40724b.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                li0 li0Var = this.f40724b;
                li0Var.R = null;
                li0Var.f35763o0 = 0.0f;
                li0Var.m0 = null;
                li0Var.invalidate();
                return;
        }
    }
}
