package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg0 extends AnimatorListenerAdapter {
    public final int f24274a;
    public final gg0 f24275b;

    public fg0(gg0 gg0Var, int i10) {
        this.f24274a = i10;
        this.f24275b = gg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24274a) {
            case 0:
                gg0 gg0Var = this.f24275b;
                gg0Var.h = false;
                gg0Var.f24488a = gg0Var.f24490c;
                gg0Var.invalidate();
                int i10 = gg0Var.J;
                if (i10 >= 0) {
                    gg0Var.b(i10);
                    gg0Var.J = -1;
                    return;
                }
                return;
            default:
                gg0 gg0Var2 = this.f24275b;
                gg0Var2.f24492n = false;
                gg0Var2.h = false;
                gg0Var2.invalidate();
                int i11 = gg0Var2.J;
                if (i11 >= 0) {
                    gg0Var2.b(i11);
                    gg0Var2.J = -1;
                }
                gg0Var2.a();
                return;
        }
    }
}
