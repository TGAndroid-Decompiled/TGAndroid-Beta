package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd0 extends AnimatorListenerAdapter {
    public final int f35931a;
    public final fg0 f35932b;

    public cd0(fg0 fg0Var, int i10) {
        this.f35931a = i10;
        this.f35932b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35931a) {
            case 0:
                fg0 fg0Var = this.f35932b;
                if (fg0Var.d == animator) {
                    fg0Var.d = null;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f35932b;
                fg0Var2.f36930c.setVisibility(8);
                if (fg0Var2.d == animator) {
                    fg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35931a) {
            case 0:
                this.f35932b.f36930c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
