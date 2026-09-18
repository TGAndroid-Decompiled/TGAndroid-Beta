package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i70 extends AnimatorListenerAdapter {
    public final int f24863a;
    public final j70 f24864b;

    public i70(j70 j70Var, int i10) {
        this.f24863a = i10;
        this.f24864b = j70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24863a) {
            case 0:
                j70 j70Var = this.f24864b;
                j70Var.e.f25603d0 = null;
                j70Var.requestLayout();
                return;
            default:
                j70 j70Var2 = this.f24864b;
                j70Var2.e.f25603d0 = null;
                j70Var2.f25190a = false;
                return;
        }
    }
}
