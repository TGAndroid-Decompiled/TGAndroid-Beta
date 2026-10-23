package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31419a;
    public final h3 f31420b;

    public f3(h3 h3Var, int i10) {
        this.f31419a = i10;
        this.f31420b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31419a) {
            case 0:
                h3 h3Var = this.f31420b;
                h3Var.f31463r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31420b;
                h3Var2.f31464s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
