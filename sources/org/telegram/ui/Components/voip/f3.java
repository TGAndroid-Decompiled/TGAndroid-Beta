package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31570a;
    public final h3 f31571b;

    public f3(h3 h3Var, int i10) {
        this.f31570a = i10;
        this.f31571b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31570a) {
            case 0:
                h3 h3Var = this.f31571b;
                h3Var.f31614r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31571b;
                h3Var2.f31615s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
