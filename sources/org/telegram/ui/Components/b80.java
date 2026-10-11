package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b80 extends AnimatorListenerAdapter {
    public final int f24932a;
    public final c80 f24933b;

    public b80(c80 c80Var, int i10) {
        this.f24932a = i10;
        this.f24933b = c80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24932a) {
            case 0:
                c80 c80Var = this.f24933b;
                c80Var.f25261e.f25658d0 = null;
                c80Var.requestLayout();
                return;
            default:
                c80 c80Var2 = this.f24933b;
                c80Var2.f25261e.f25658d0 = null;
                c80Var2.f25258a = false;
                return;
        }
    }
}
