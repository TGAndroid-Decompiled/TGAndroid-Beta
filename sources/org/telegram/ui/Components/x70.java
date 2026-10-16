package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x70 extends AnimatorListenerAdapter {
    public final int f30887a;
    public final y70 f30888b;

    public x70(y70 y70Var, int i10) {
        this.f30887a = i10;
        this.f30888b = y70Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30887a) {
            case 0:
                y70 y70Var = this.f30888b;
                y70Var.e.f31476d0 = null;
                y70Var.requestLayout();
                return;
            default:
                y70 y70Var2 = this.f30888b;
                y70Var2.e.f31476d0 = null;
                y70Var2.f31172a = false;
                return;
        }
    }
}
