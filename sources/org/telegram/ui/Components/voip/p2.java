package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f31648a;
    public final r2 f31649b;

    public p2(r2 r2Var, int i10) {
        this.f31648a = i10;
        this.f31649b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31648a) {
            case 0:
                r2 r2Var = this.f31649b;
                r2Var.f31707r = 0;
                r2Var.invalidate();
                return;
            default:
                r2 r2Var2 = this.f31649b;
                r2Var2.f31708s = 0;
                r2Var2.invalidate();
                return;
        }
    }
}
