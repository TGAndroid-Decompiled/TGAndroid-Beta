package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cb0 extends AnimatorListenerAdapter {
    public final int f44716a;
    public final ce0 f44717b;

    public cb0(ce0 ce0Var, int i7) {
        this.f44716a = i7;
        this.f44717b = ce0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44716a) {
            case 0:
                ce0 ce0Var = this.f44717b;
                if (ce0Var.d == animator) {
                    ce0Var.d = null;
                    return;
                }
                return;
            default:
                ce0 ce0Var2 = this.f44717b;
                ce0Var2.f44740c.setVisibility(8);
                if (ce0Var2.d == animator) {
                    ce0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44716a) {
            case 0:
                this.f44717b.f44740c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
