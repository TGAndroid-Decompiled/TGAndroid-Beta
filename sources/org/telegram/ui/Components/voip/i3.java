package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f29315a;
    public final k3 f29316b;

    public i3(k3 k3Var, int i10) {
        this.f29315a = i10;
        this.f29316b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29315a) {
            case 0:
                k3 k3Var = this.f29316b;
                k3Var.f29355r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f29316b;
                k3Var2.f29356s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
