package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31517a;
    public final h3 f31518b;

    public f3(h3 h3Var, int i10) {
        this.f31517a = i10;
        this.f31518b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31517a) {
            case 0:
                h3 h3Var = this.f31518b;
                h3Var.f31564r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31518b;
                h3Var2.f31565s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
