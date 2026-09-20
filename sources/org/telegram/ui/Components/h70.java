package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h70 extends AnimatorListenerAdapter {
    public final int f24561a;
    public final i70 f24562b;

    public h70(i70 i70Var, int i10) {
        this.f24561a = i10;
        this.f24562b = i70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24561a) {
            case 0:
                i70 i70Var = this.f24562b;
                i70Var.e.f25252d0 = null;
                i70Var.requestLayout();
                return;
            default:
                i70 i70Var2 = this.f24562b;
                i70Var2.e.f25252d0 = null;
                i70Var2.f24899a = false;
                return;
        }
    }
}
