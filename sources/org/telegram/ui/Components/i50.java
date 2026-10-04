package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i50 extends AnimatorListenerAdapter {
    public final int f27315a;
    public final f60 f27316b;

    public i50(f60 f60Var, int i10) {
        this.f27315a = i10;
        this.f27316b = f60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27315a) {
            case 0:
                f60 f60Var = this.f27316b;
                if (animator.equals(f60Var.L)) {
                    f60Var.L = null;
                    return;
                }
                return;
            case 1:
                f60 f60Var2 = this.f27316b;
                if (f60Var2.f26314g1 != null) {
                    f60Var2.f26314g1 = null;
                    return;
                }
                return;
            default:
                f60 f60Var3 = this.f27316b;
                if (animator.equals(f60Var3.f26308e0)) {
                    f60Var3.c(true);
                    f60Var3.f26303b1 = false;
                    f60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
