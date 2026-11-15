package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x50 extends AnimatorListenerAdapter {
    public final int f41592a;
    public final z50 f41593b;

    public x50(z50 z50Var, int i7) {
        this.f41592a = i7;
        this.f41593b = z50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41592a) {
            case 0:
                z50 z50Var = this.f41593b;
                z50Var.f42254e.Y1 = null;
                z50Var.requestLayout();
                return;
            default:
                z50 z50Var2 = this.f41593b;
                z50Var2.f42254e.Y1 = null;
                z50Var2.f42251a = false;
                return;
        }
    }
}
