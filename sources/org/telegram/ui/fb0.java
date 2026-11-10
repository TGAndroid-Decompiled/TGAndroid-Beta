package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fb0 extends AnimatorListenerAdapter {
    public final int f45673a;
    public final fe0 f45674b;

    public fb0(fe0 fe0Var, int i7) {
        this.f45673a = i7;
        this.f45674b = fe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45673a) {
            case 0:
                fe0 fe0Var = this.f45674b;
                if (fe0Var.d == animator) {
                    fe0Var.d = null;
                    return;
                }
                return;
            default:
                fe0 fe0Var2 = this.f45674b;
                fe0Var2.f45696c.setVisibility(8);
                if (fe0Var2.d == animator) {
                    fe0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45673a) {
            case 0:
                this.f45674b.f45696c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
