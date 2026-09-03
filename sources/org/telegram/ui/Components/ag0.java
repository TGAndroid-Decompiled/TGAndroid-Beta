package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag0 extends AnimatorListenerAdapter {
    public final int f23372a;
    public final bg0 f23373b;

    public ag0(bg0 bg0Var, int i10) {
        this.f23372a = i10;
        this.f23373b = bg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23372a) {
            case 0:
                bg0 bg0Var = this.f23373b;
                bg0Var.h = false;
                bg0Var.f23670a = bg0Var.f23672c;
                bg0Var.invalidate();
                int i10 = bg0Var.G;
                if (i10 >= 0) {
                    bg0Var.b(i10);
                    bg0Var.G = -1;
                    return;
                }
                return;
            default:
                bg0 bg0Var2 = this.f23373b;
                bg0Var2.f23674n = false;
                bg0Var2.h = false;
                bg0Var2.invalidate();
                int i11 = bg0Var2.G;
                if (i11 >= 0) {
                    bg0Var2.b(i11);
                    bg0Var2.G = -1;
                }
                bg0Var2.a();
                return;
        }
    }
}
