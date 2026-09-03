package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j50 extends AnimatorListenerAdapter {
    public final int f27995a;
    public final z50 f27996b;

    public j50(z50 z50Var, int i10) {
        this.f27995a = i10;
        this.f27996b = z50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27995a) {
            case 0:
                z50 z50Var = this.f27996b;
                if (animator.equals(z50Var.D)) {
                    z50Var.D = null;
                    return;
                }
                return;
            case 1:
                z50 z50Var2 = this.f27996b;
                if (z50Var2.Y0 != null) {
                    z50Var2.Y0 = null;
                    return;
                }
                return;
            default:
                z50 z50Var3 = this.f27996b;
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
