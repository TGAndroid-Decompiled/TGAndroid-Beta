package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f40538a;
    public final e3 f40539b;

    public c3(e3 e3Var, int i7) {
        this.f40538a = i7;
        this.f40539b = e3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40538a) {
            case 0:
                e3 e3Var = this.f40539b;
                e3Var.f40598r = 0;
                e3Var.invalidate();
                return;
            default:
                e3 e3Var2 = this.f40539b;
                e3Var2.f40599s = 0;
                e3Var2.invalidate();
                return;
        }
    }
}
