package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e80 extends AnimatorListenerAdapter {
    public final int f25630a;
    public final f80 f25631b;

    public e80(f80 f80Var, int i10) {
        this.f25630a = i10;
        this.f25631b = f80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25630a) {
            case 0:
                f80 f80Var = this.f25631b;
                f80Var.f25964e.f26324d0 = null;
                f80Var.requestLayout();
                return;
            default:
                f80 f80Var2 = this.f25631b;
                f80Var2.f25964e.f26324d0 = null;
                f80Var2.f25961a = false;
                return;
        }
    }
}
