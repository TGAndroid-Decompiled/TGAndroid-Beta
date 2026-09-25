package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg0 extends AnimatorListenerAdapter {
    public final int f23957a;
    public final fg0 f23958b;

    public eg0(fg0 fg0Var, int i10) {
        this.f23957a = i10;
        this.f23958b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23957a) {
            case 0:
                fg0 fg0Var = this.f23958b;
                fg0Var.h = false;
                fg0Var.f24175a = fg0Var.f24177c;
                fg0Var.invalidate();
                int i10 = fg0Var.J;
                if (i10 >= 0) {
                    fg0Var.b(i10);
                    fg0Var.J = -1;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f23958b;
                fg0Var2.f24179n = false;
                fg0Var2.h = false;
                fg0Var2.invalidate();
                int i11 = fg0Var2.J;
                if (i11 >= 0) {
                    fg0Var2.b(i11);
                    fg0Var2.J = -1;
                }
                fg0Var2.a();
                return;
        }
    }
}
