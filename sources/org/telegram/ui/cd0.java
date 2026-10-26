package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd0 extends AnimatorListenerAdapter {
    public final int f38431a;
    public final gg0 f38432b;

    public cd0(gg0 gg0Var, int i10) {
        this.f38431a = i10;
        this.f38432b = gg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38431a) {
            case 0:
                gg0 gg0Var = this.f38432b;
                if (gg0Var.d == animator) {
                    gg0Var.d = null;
                    return;
                }
                return;
            default:
                gg0 gg0Var2 = this.f38432b;
                gg0Var2.f39655c.setVisibility(8);
                if (gg0Var2.d == animator) {
                    gg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38431a) {
            case 0:
                this.f38432b.f39655c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
