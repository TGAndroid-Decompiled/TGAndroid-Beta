package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qd0 extends AnimatorListenerAdapter {
    public final int f36398a;
    public final rg0 f36399b;

    public qd0(rg0 rg0Var, int i10) {
        this.f36398a = i10;
        this.f36399b = rg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36398a) {
            case 0:
                rg0 rg0Var = this.f36399b;
                if (rg0Var.d == animator) {
                    rg0Var.d = null;
                    return;
                }
                return;
            default:
                rg0 rg0Var2 = this.f36399b;
                rg0Var2.f36822c.setVisibility(8);
                if (rg0Var2.d == animator) {
                    rg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36398a) {
            case 0:
                this.f36399b.f36822c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
