package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i70 extends AnimatorListenerAdapter {
    public final int f23919a;
    public final j70 f23920b;

    public i70(j70 j70Var, int i10) {
        this.f23919a = i10;
        this.f23920b = j70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23919a) {
            case 0:
                j70 j70Var = this.f23920b;
                j70Var.e.f24629d0 = null;
                j70Var.requestLayout();
                return;
            default:
                j70 j70Var2 = this.f23920b;
                j70Var2.e.f24629d0 = null;
                j70Var2.f24258a = false;
                return;
        }
    }
}
