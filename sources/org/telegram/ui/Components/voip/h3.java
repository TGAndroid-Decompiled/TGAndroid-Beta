package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f29389a;
    public final j3 f29390b;

    public h3(j3 j3Var, int i10) {
        this.f29389a = i10;
        this.f29390b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29389a) {
            case 0:
                j3 j3Var = this.f29390b;
                j3Var.f29426r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f29390b;
                j3Var2.f29427s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
