package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j50 extends AnimatorListenerAdapter {
    public final int f28005a;
    public final z50 f28006b;

    public j50(z50 z50Var, int i10) {
        this.f28005a = i10;
        this.f28006b = z50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28005a) {
            case 0:
                z50 z50Var = this.f28006b;
                if (animator.equals(z50Var.D)) {
                    z50Var.D = null;
                    return;
                }
                return;
            case 1:
                z50 z50Var2 = this.f28006b;
                if (z50Var2.Y0 != null) {
                    z50Var2.Y0 = null;
                    return;
                }
                return;
            default:
                z50 z50Var3 = this.f28006b;
                if (animator.equals(z50Var3.T)) {
                    z50Var3.h(true);
                    z50Var3.T0 = false;
                    z50Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
