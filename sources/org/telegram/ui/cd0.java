package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd0 extends AnimatorListenerAdapter {
    public final int f35885a;
    public final eg0 f35886b;

    public cd0(eg0 eg0Var, int i10) {
        this.f35885a = i10;
        this.f35886b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35885a) {
            case 0:
                eg0 eg0Var = this.f35886b;
                if (eg0Var.d == animator) {
                    eg0Var.d = null;
                    return;
                }
                return;
            default:
                eg0 eg0Var2 = this.f35886b;
                eg0Var2.f36493c.setVisibility(8);
                if (eg0Var2.d == animator) {
                    eg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35885a) {
            case 0:
                this.f35886b.f36493c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
