package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f39784a;
    public final y20 f39785b;

    public w20(y20 y20Var, int i7) {
        this.f39784a = i7;
        this.f39785b = y20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39784a) {
            case 0:
                y20 y20Var = this.f39785b;
                y20Var.d = null;
                gp gpVar = new gp(this, 20);
                y20Var.f40541e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, y20Var.f40546w);
                return;
            default:
                y20 y20Var2 = this.f39785b;
                y20Var2.setVisibility(4);
                y20Var2.f40540c = null;
                y20Var2.d = null;
                return;
        }
    }
}
