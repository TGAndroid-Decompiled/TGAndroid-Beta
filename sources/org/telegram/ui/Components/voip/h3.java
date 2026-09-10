package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h3 extends AnimatorListenerAdapter {
    public final int f28162a;
    public final j3 f28163b;

    public h3(j3 j3Var, int i10) {
        this.f28162a = i10;
        this.f28163b = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28162a) {
            case 0:
                j3 j3Var = this.f28163b;
                j3Var.f28200r = 0;
                j3Var.invalidate();
                return;
            default:
                j3 j3Var2 = this.f28163b;
                j3Var2.f28201s = 0;
                j3Var2.invalidate();
                return;
        }
    }
}
