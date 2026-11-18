package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v01 extends AnimatorListenerAdapter {
    public final int f40466a;
    public final f11 f40467b;

    public v01(f11 f11Var, int i7) {
        this.f40466a = i7;
        this.f40467b = f11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40466a) {
            case 0:
                f11 f11Var = this.f40467b;
                if (f11Var.f34876b0 == animator) {
                    f11Var.f34876b0 = null;
                    return;
                }
                return;
            case 1:
                f11 f11Var2 = this.f40467b;
                if (f11Var2.f34888k0 == animator) {
                    f11Var2.f34888k0 = null;
                }
                f11Var2.c(1.0f);
                return;
            default:
                f11 f11Var3 = this.f40467b;
                if (f11Var3.K == animator) {
                    f11Var3.K = null;
                    return;
                }
                return;
        }
    }
}
