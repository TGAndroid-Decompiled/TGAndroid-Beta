package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nd0 extends AnimatorListenerAdapter {
    public final int f36605a;
    public final ng0 f36606b;

    public nd0(ng0 ng0Var, int i10) {
        this.f36605a = i10;
        this.f36606b = ng0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36605a) {
            case 0:
                ng0 ng0Var = this.f36606b;
                if (ng0Var.d == animator) {
                    ng0Var.d = null;
                    return;
                }
                return;
            default:
                ng0 ng0Var2 = this.f36606b;
                ng0Var2.f36626c.setVisibility(8);
                if (ng0Var2.d == animator) {
                    ng0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36605a) {
            case 0:
                this.f36606b.f36626c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
