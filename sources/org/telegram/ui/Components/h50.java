package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h50 extends AnimatorListenerAdapter {
    public final int f25330a;
    public final x50 f25331b;

    public h50(x50 x50Var, int i10) {
        this.f25330a = i10;
        this.f25331b = x50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25330a) {
            case 0:
                x50 x50Var = this.f25331b;
                if (animator.equals(x50Var.D)) {
                    x50Var.D = null;
                    return;
                }
                return;
            case 1:
                x50 x50Var2 = this.f25331b;
                if (x50Var2.Y0 != null) {
                    x50Var2.Y0 = null;
                    return;
                }
                return;
            default:
                x50 x50Var3 = this.f25331b;
                if (animator.equals(x50Var3.T)) {
                    x50Var3.h(true);
                    x50Var3.T0 = false;
                    x50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
