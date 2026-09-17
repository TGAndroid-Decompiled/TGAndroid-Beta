package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f28963a;
    public final j3 f28964b;

    public h3(j3 j3Var, int i10) {
        this.f28963a = i10;
        this.f28964b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28963a) {
            case 0:
                j3 j3Var = this.f28964b;
                j3Var.f29000r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f28964b;
                j3Var2.f29001s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
