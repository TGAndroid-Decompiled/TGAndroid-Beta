package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f29320a;
    public final k3 f29321b;

    public i3(k3 k3Var, int i10) {
        this.f29320a = i10;
        this.f29321b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29320a) {
            case 0:
                k3 k3Var = this.f29321b;
                k3Var.f29360r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f29321b;
                k3Var2.f29361s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
