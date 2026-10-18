package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31461a;
    public final h3 f31462b;

    public f3(h3 h3Var, int i10) {
        this.f31461a = i10;
        this.f31462b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31461a) {
            case 0:
                h3 h3Var = this.f31462b;
                h3Var.f31505r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31462b;
                h3Var2.f31506s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
