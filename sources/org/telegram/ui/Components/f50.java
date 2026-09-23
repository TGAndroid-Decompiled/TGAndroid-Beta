package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f50 extends AnimatorListenerAdapter {
    public final int f23851a;
    public final x50 f23852b;

    public f50(x50 x50Var, int i10) {
        this.f23851a = i10;
        this.f23852b = x50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23851a) {
            case 0:
                x50 x50Var = this.f23852b;
                if (animator.equals(x50Var.G)) {
                    x50Var.G = null;
                    return;
                }
                return;
            case 1:
                x50 x50Var2 = this.f23852b;
                if (x50Var2.f29893b1 != null) {
                    x50Var2.f29893b1 = null;
                    return;
                }
                return;
            default:
                x50 x50Var3 = this.f23852b;
                if (animator.equals(x50Var3.W)) {
                    x50Var3.h(true);
                    x50Var3.W0 = false;
                    x50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
