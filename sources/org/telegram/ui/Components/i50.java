package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i50 extends AnimatorListenerAdapter {
    public final int f27310a;
    public final f60 f27311b;

    public i50(f60 f60Var, int i10) {
        this.f27310a = i10;
        this.f27311b = f60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27310a) {
            case 0:
                f60 f60Var = this.f27311b;
                if (animator.equals(f60Var.L)) {
                    f60Var.L = null;
                    return;
                }
                return;
            case 1:
                f60 f60Var2 = this.f27311b;
                if (f60Var2.f26309g1 != null) {
                    f60Var2.f26309g1 = null;
                    return;
                }
                return;
            default:
                f60 f60Var3 = this.f27311b;
                if (animator.equals(f60Var3.f26303e0)) {
                    f60Var3.c(true);
                    f60Var3.f26298b1 = false;
                    f60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
