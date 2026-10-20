package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31414a;
    public final h3 f31415b;

    public f3(h3 h3Var, int i10) {
        this.f31414a = i10;
        this.f31415b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31414a) {
            case 0:
                h3 h3Var = this.f31415b;
                h3Var.f31458r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31415b;
                h3Var2.f31459s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
