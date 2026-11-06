package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f39834a;
    public final y20 f39835b;

    public w20(y20 y20Var, int i7) {
        this.f39834a = i7;
        this.f39835b = y20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39834a) {
            case 0:
                y20 y20Var = this.f39835b;
                y20Var.d = null;
                gp gpVar = new gp(this, 20);
                y20Var.f40515e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, y20Var.f40520w);
                return;
            default:
                y20 y20Var2 = this.f39835b;
                y20Var2.setVisibility(4);
                y20Var2.f40514c = null;
                y20Var2.d = null;
                return;
        }
    }
}
