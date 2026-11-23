package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j60 extends AnimatorListenerAdapter {
    public final int f36426a;
    public final k60 f36427b;

    public j60(k60 k60Var, int i7) {
        this.f36426a = i7;
        this.f36427b = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36426a) {
            case 0:
                k60 k60Var = this.f36427b;
                k60Var.f36819e.Y1 = null;
                k60Var.requestLayout();
                return;
            default:
                k60 k60Var2 = this.f36427b;
                k60Var2.f36819e.Y1 = null;
                k60Var2.f36816a = false;
                return;
        }
    }
}
