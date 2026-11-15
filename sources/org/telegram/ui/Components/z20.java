package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z20 extends AnimatorListenerAdapter {
    public final int f42219a;
    public final b30 f42220b;

    public z20(b30 b30Var, int i7) {
        this.f42219a = i7;
        this.f42220b = b30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42219a) {
            case 0:
                b30 b30Var = this.f42220b;
                b30Var.d = null;
                fo foVar = new fo(this, 22);
                b30Var.f33164e = foVar;
                org.telegram.messenger.g0.i3(foVar, b30Var.f33169w);
                return;
            default:
                b30 b30Var2 = this.f42220b;
                b30Var2.setVisibility(4);
                b30Var2.f33163c = null;
                b30Var2.d = null;
                return;
        }
    }
}
