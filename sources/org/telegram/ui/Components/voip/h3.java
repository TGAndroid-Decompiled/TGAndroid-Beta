package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f28986a;
    public final j3 f28987b;

    public h3(j3 j3Var, int i10) {
        this.f28986a = i10;
        this.f28987b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28986a) {
            case 0:
                j3 j3Var = this.f28987b;
                j3Var.f29023r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f28987b;
                j3Var2.f29024s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
