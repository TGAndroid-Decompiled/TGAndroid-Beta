package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v30 extends AnimatorListenerAdapter {
    public final int f29350a;
    public final x30 f29351b;

    public v30(x30 x30Var, int i10) {
        this.f29350a = i10;
        this.f29351b = x30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29350a) {
            case 0:
                x30 x30Var = this.f29351b;
                if (x30Var.V == animator) {
                    x30Var.V = null;
                    x30Var.b();
                    return;
                }
                return;
            default:
                x30 x30Var2 = this.f29351b;
                if (x30Var2.U == animator) {
                    x30Var2.U = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29350a) {
            case 1:
                w30 w30Var = this.f29351b.T;
                if (w30Var != null) {
                    ((org.telegram.ui.zr0) w30Var).f40856a.f31705b0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
