package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f39813a;
    public final y20 f39814b;

    public w20(y20 y20Var, int i7) {
        this.f39813a = i7;
        this.f39814b = y20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39813a) {
            case 0:
                y20 y20Var = this.f39814b;
                y20Var.d = null;
                gp gpVar = new gp(this, 20);
                y20Var.f40499e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, y20Var.f40504w);
                return;
            default:
                y20 y20Var2 = this.f39814b;
                y20Var2.setVisibility(4);
                y20Var2.f40498c = null;
                y20Var2.d = null;
                return;
        }
    }
}
