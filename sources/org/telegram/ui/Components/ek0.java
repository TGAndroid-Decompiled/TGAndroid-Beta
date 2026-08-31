package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ek0 extends AnimatorListenerAdapter {
    public final int f26569a;
    public final rk0 f26570b;

    public ek0(rk0 rk0Var, int i10) {
        this.f26569a = i10;
        this.f26570b = rk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26569a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f26570b.I0.unlock();
                return;
            case 1:
                super.onAnimationEnd(animator);
                rk0 rk0Var = this.f26570b;
                rk0Var.N = null;
                rk0Var.f30774k0 = 0.0f;
                rk0Var.f30772i0 = null;
                rk0Var.invalidate();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f26570b);
                return;
        }
    }
}
