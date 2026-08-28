package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f37501a;
    public final fg0 f37502b;

    public dd0(fg0 fg0Var, int i9) {
        this.f37501a = i9;
        this.f37502b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37501a) {
            case 0:
                fg0 fg0Var = this.f37502b;
                if (fg0Var.d == animator) {
                    fg0Var.d = null;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f37502b;
                fg0Var2.f38263c.setVisibility(8);
                if (fg0Var2.d == animator) {
                    fg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37501a) {
            case 0:
                this.f37502b.f38263c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
