package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g3 extends AnimatorListenerAdapter {
    public final int f33535a;
    public final i3 f33536b;

    public g3(i3 i3Var, int i9) {
        this.f33535a = i9;
        this.f33536b = i3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33535a) {
            case 0:
                i3 i3Var = this.f33536b;
                i3Var.f33572r = 0;
                i3Var.invalidate();
                return;
            default:
                i3 i3Var2 = this.f33536b;
                i3Var2.f33573s = 0;
                i3Var2.invalidate();
                return;
        }
    }
}
