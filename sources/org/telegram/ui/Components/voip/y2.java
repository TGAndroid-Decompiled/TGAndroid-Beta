package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f39662a;
    public final a3 f39663b;

    public y2(a3 a3Var, int i7) {
        this.f39662a = i7;
        this.f39663b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39662a) {
            case 0:
                a3 a3Var = this.f39663b;
                a3Var.f39103r = 0;
                a3Var.invalidate();
                return;
            default:
                a3 a3Var2 = this.f39663b;
                a3Var2.f39104s = 0;
                a3Var2.invalidate();
                return;
        }
    }
}
