package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j3 extends AnimatorListenerAdapter {
    public final int f33780a;
    public final l3 f33781b;

    public j3(l3 l3Var, int i10) {
        this.f33780a = i10;
        this.f33781b = l3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33780a) {
            case 0:
                l3 l3Var = this.f33781b;
                l3Var.f33842r = 0;
                l3Var.invalidate();
                return;
            default:
                l3 l3Var2 = this.f33781b;
                l3Var2.f33843s = 0;
                l3Var2.invalidate();
                return;
        }
    }
}
