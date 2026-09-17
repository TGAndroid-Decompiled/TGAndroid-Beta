package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e50 extends AnimatorListenerAdapter {
    public final int f23485a;
    public final w50 f23486b;

    public e50(w50 w50Var, int i10) {
        this.f23485a = i10;
        this.f23486b = w50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23485a) {
            case 0:
                w50 w50Var = this.f23486b;
                if (animator.equals(w50Var.G)) {
                    w50Var.G = null;
                    return;
                }
                return;
            case 1:
                w50 w50Var2 = this.f23486b;
                if (w50Var2.f29534b1 != null) {
                    w50Var2.f29534b1 = null;
                    return;
                }
                return;
            default:
                w50 w50Var3 = this.f23486b;
                if (animator.equals(w50Var3.W)) {
                    w50Var3.h(true);
                    w50Var3.W0 = false;
                    w50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
