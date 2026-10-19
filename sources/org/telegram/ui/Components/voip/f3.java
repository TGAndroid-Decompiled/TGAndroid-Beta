package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31463a;
    public final h3 f31464b;

    public f3(h3 h3Var, int i10) {
        this.f31463a = i10;
        this.f31464b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31463a) {
            case 0:
                h3 h3Var = this.f31464b;
                h3Var.f31507r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31464b;
                h3Var2.f31508s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
