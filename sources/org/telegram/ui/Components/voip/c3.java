package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f40535a;
    public final e3 f40536b;

    public c3(e3 e3Var, int i7) {
        this.f40535a = i7;
        this.f40536b = e3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40535a) {
            case 0:
                e3 e3Var = this.f40536b;
                e3Var.f40595r = 0;
                e3Var.invalidate();
                return;
            default:
                e3 e3Var2 = this.f40536b;
                e3Var2.f40596s = 0;
                e3Var2.invalidate();
                return;
        }
    }
}
