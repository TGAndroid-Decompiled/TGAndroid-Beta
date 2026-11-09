package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f40278a;
    public final z20 f40279b;

    public x20(z20 z20Var, int i7) {
        this.f40278a = i7;
        this.f40279b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40278a) {
            case 0:
                z20 z20Var = this.f40279b;
                z20Var.d = null;
                gp gpVar = new gp(this, 20);
                z20Var.f40874e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, z20Var.f40879w);
                return;
            default:
                z20 z20Var2 = this.f40279b;
                z20Var2.setVisibility(4);
                z20Var2.f40873c = null;
                z20Var2.d = null;
                return;
        }
    }
}
