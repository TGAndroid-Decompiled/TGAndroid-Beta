package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f28966a;
    public final j3 f28967b;

    public h3(j3 j3Var, int i10) {
        this.f28966a = i10;
        this.f28967b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28966a) {
            case 0:
                j3 j3Var = this.f28967b;
                j3Var.f29003r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f28967b;
                j3Var2.f29004s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
